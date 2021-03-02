package activitytrackerdao;

import arraylist.Books;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityTrackerMain {

    public static void main(String[] args) {


        MariaDbDataSource dataSource;


        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3307/activitytracker?userUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot Connect!", sqlException);
        }

        Activity activity = new Activity(LocalDateTime.of(2021, 02, 23, 10, 11), "Biking in Zemplén", ActivityType.BIKING);
        Activity activity1 = new Activity(LocalDateTime.of(2021, 02, 23, 10, 11), "Hiking in Zemplén", ActivityType.HIKING);
        Activity activity2 = new Activity(LocalDateTime.of(2021, 02, 23, 10, 11), "Running in Zemplén", ActivityType.RUNNING);
        activity.getDesc().equals(activity.getDesc());
//       activityDao.insertActivity(dataSource, activity);
//        activityDao.insertActivity(dataSource, activity1);
//       activityDao.insertActivity(dataSource, activity2);

        ActivityDao activityDao = new ActivityDao(dataSource);

        System.out.println(activityDao.selectById( 3));
        System.out.println(activityDao.selectAllActivities());
        System.out.println(activityDao.selectActivitiesByType(ActivityType.BIKING));


    }
}
