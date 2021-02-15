package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {

    private List<Activity> activities = new ArrayList<>();

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity act) {
        if (act == null) {
            throw new IllegalArgumentException("Activity object can not null condition.");
        }
        activities.add(act);
    }

    public List<Report> distancesByTypes() {
        List<Report> result = new ArrayList<>();
        for (Activity activity : activities) {
            result.add(new Report(activity.getType(), activity.getDistance()));
        }
        return result;
    }

    public int numberOfTrackActivities() {
        int counter = 0;
        for (Activity activity : activities) {
            if (activity instanceof ActivityWithTrack) {
                counter++;
            }
        }
        return counter;
    }

    public int numberOfWithoutTrackActivities() {
        int sum = 0;
        for (Activity activity : activities) {
            if (activity instanceof ActivityWithoutTrack) {
                sum++;
            }
        }
        return sum;
    }
}
