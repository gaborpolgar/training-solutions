package activitytrackerdao;

import activity.Track;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {

    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Activity insertActivity(Activity activity) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time,activity_desc,activity_type) values (?,?,?)", Statement.RETURN_GENERATED_KEYS)) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();
            Activity result = getIdAfterExecuted(activity, stmt);
            insertActivityTrackPoints(activity.getTrackPoints(), result.getId());
            return result;

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot Connect!", sqlException);
        }
    }

    private void insertActivityTrackPoints(List<TrackPoint> trackPoints, long activityId) {
        try (Connection conn = dataSource.getConnection()) {
            conn.setAutoCommit(false);
            try (PreparedStatement stmt = conn.prepareStatement("insert into track_points(act_time, lat, lon, activityId) values (?,?,?,?)")) {
                for (TrackPoint trackPoint : trackPoints) {
                    if (!isValidLatLon(trackPoint.getLat(), trackPoint.getLon())) {
                        throw new IllegalArgumentException("Invalid lat or lon!");
                    }
                    stmt.setDate(1, Date.valueOf(trackPoint.getTime()));
                    stmt.setDouble(2, trackPoint.getLat());
                    stmt.setDouble(3, trackPoint.getLon());
                    stmt.setLong(4, activityId);
                    stmt.executeUpdate();
                }
            } catch (IllegalArgumentException iae) {
                conn.rollback();
                throw new IllegalStateException("Can not syncronized the data");
            }
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot connect!", sqlException);
        }
    }

    private boolean isValidLatLon(double lat, double lon) {
        if (lat > 90 || lat < -90) {
            return false;
        }
        if (lon > 180 || lon < -180) {
            return false;
        }
        return true;
    }


    private Activity getIdAfterExecuted(Activity activity, PreparedStatement stmt) throws SQLException {
        try (ResultSet rs = stmt.getGeneratedKeys()) {
            if (rs.next()) {
                long id = rs.getLong(1);
                return new Activity(id, activity.getStartTime(), activity.getDesc(), activity.getType());
            }
        }
        throw new IllegalStateException("Cannot get key!");
    }

    public String createStatementForMoreInsert(int numberOfElements) {
        StringBuilder sb = new StringBuilder("insert into activities(start_time,activity_desc,activity_type) values ");
        for (int i = 0; i < numberOfElements; i++) {
            sb.append("(?,?,?)");
        }
        return sb.toString();
    }

    public List<Activity> selectAllActivities() {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities")) {
            return selectActivityByPreparedStatement(stmt);
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed!", sqlException);
        }
    }

    public Activity selectById(long id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities where id =?");
             PreparedStatement stmt2 = conn.prepareStatement("select * from track_points where activityId = ?")) {
            stmt.setLong(1, id);
            List<Activity> result = selectActivityByPreparedStatement(stmt);
            if (result.size() == 1) {
                stmt2.setLong(1, id);
                List<TrackPoint> resultPoints = selectTrackPointsByPreparedStatement(stmt2);
                result.get(0).addTrackPoints(resultPoints);
                return result.get(0);
            }
            throw new IllegalArgumentException("Not found!");
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot Connect!", sqlException);
        }
    }

    private List<Activity> selectActivityByPreparedStatement(PreparedStatement stmt) {
        List<Activity> result = new ArrayList<>();
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Activity activity = new Activity(rs.getLong("id"), rs.getTimestamp("start_time").toLocalDateTime(),
                        rs.getString("activity_desc"), ActivityType.valueOf(rs.getString("activity_type")));
                result.add(activity);
            }
            return result;
        } catch (SQLException sqlException) {
            throw new IllegalArgumentException("Wrong statement", sqlException);
        }
    }

    private List<TrackPoint> selectTrackPointsByPreparedStatement(PreparedStatement stmt) {
        List<TrackPoint> result = new ArrayList<>();
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                TrackPoint trackPoint = new TrackPoint(rs.getLong("id"), rs.getDate("act_time").toLocalDate(), rs.getDouble("lat"), rs.getDouble("long"));
                result.add(trackPoint);
            }
            return result;
        } catch (SQLException sqlException) {
            throw new IllegalArgumentException("Wrong statement", sqlException);
        }
    }

    public List<Activity> selectActivitiesByType(ActivityType type) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities where activity_type =?")) {
            stmt.setString(1, type.toString());
            return selectActivityByPreparedStatement(stmt);
        } catch (SQLException sqlException) {
            throw new IllegalArgumentException("Connection failed!!", sqlException);
        }
    }

    public List<Activity> selectActivitesByType(ActivityType type) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities where activity_type = ?")) {
            stmt.setString(1, type.toString());
            return selectActivityByPreparedStatement(stmt);
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed!", sqlException);
        }
    }

    public List<Activity> activitiesBeforeDate(LocalDate date) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities where start_time < ? ")) {
            // LocalDateTime actualDate = date.atTime(0, 0);
            stmt.setTimestamp(1, Timestamp.valueOf(LocalDateTime.of(date.getYear(), date.getMonth(), date.getDayOfMonth(), 00, 00, 00)));
            return selectActivityByPreparedStatement(stmt);
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed!", sqlException);
        }
    }


}
