package activitytrackerdao;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Activity {

    private static final double MIN_PRICE = 10.0;
    private long id;
    private LocalDateTime startTime;
    private String desc;
    private ActivityType type;
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public Activity(long id, LocalDateTime startTime, String desc, ActivityType type) {
        this.id = id;
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
    }

    public Activity(LocalDateTime startTime, String desc, ActivityType type) {
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
    }

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public String getDesc() {
        return desc;
    }

    public ActivityType getType() {
        return type;
    }

    public List<TrackPoint> getTrackPoints() {
        return new ArrayList<>(trackPoints);
    }

    public void addTrackPoints(List<TrackPoint> trackPoints){
        this.trackPoints.addAll(trackPoints);
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", desc='" + desc + '\'' +
                ", type=" + type +
                ", trackPoints=" + trackPoints +
                '}';
    }
}
