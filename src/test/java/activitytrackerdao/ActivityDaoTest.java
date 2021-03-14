package activitytrackerdao;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActivityDaoTest {

    ActivityDao activityDao;

    @BeforeEach
            public void init() {
        MariaDbDataSource dataSource;

        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3307/activitytracker?userUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (
                SQLException sqlException) {
            throw new IllegalStateException("Cannot Connect!", sqlException);
        }
        Flyway flyway = Flyway.configure()
                //.locations("/db/migration/activitytracker")
                .dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        activityDao = new ActivityDao(dataSource);
    }

    @Test
    public void insertElementTest(){
        Activity activity = new Activity(LocalDateTime.of(2021, 02, 23, 10, 11), "Biking in Zemplén", ActivityType.BIKING);
        activityDao.insertActivity(activity);
    }

    @Test
    public void selectByTypeTest(){
        assertEquals(activityDao.selectActivitesByType(ActivityType.BIKING).size(), 1);
    }

    @Test
    public void beforeDateTest(){
        assertEquals(2, activityDao.activitiesBeforeDate(LocalDate.of(2021, 2, 12)).size());
    }

    @Test
    public void findByIdTest(){
        Activity activity = new Activity(LocalDateTime.now(), "Biking in Mecsek", ActivityType.BIKING);
        Activity result = activityDao.insertActivity(activity);

        assertEquals(activity.getDesc(), activityDao.selectById(result.getId()).getDesc());
    }

    @Test
    public void insertActivityWithTrackPointsTest(){
        Activity activity = new Activity(LocalDateTime.of(2021,02,23,10,11), "Biking in", ActivityType.BIKING);
        activity.addTrackPoints(List.of(
                new TrackPoint(LocalDate.of(2021, 02, 23), 67, 23),
                new TrackPoint(LocalDate.of(2021, 02, 23), 67, 23),
                new TrackPoint(LocalDate.of(2021, 02, 23), 67, 23)));

        Activity ac = activityDao.insertActivity(activity);
        System.out.println(activityDao.selectById(ac.getId()));
    }

}