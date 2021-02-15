package activity;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint point) {
        trackPoints.add(point);
    }

    public Coordinate findMaximumCoordinate() {
        if (trackPoints != null || trackPoints.isEmpty()) {
            throw new NullPointerException("This list must be contain at least one element! ");
        }
        TrackPoint farthestPoint = new TrackPoint(new Coordinate(-90, -180), 0);

        for (TrackPoint point : trackPoints) {
            if (point.getDistanceFrom(farthestPoint) > 0) {
                farthestPoint = point;
            }
        }
        return farthestPoint.getCoordinate();
    }

    public Coordinate findMinimumCoordinate() {
        if (trackPoints != null || trackPoints.isEmpty()) {
            throw new NullPointerException("This list must be contain at least one element! ");
        }
        TrackPoint closestPoint = new TrackPoint(new Coordinate(90, 180), 0);

        for (TrackPoint point : trackPoints) {
            if (point.getDistanceFrom(closestPoint) < 0) {
                closestPoint = point;
            }
        }
        return closestPoint.getCoordinate();
    }

    public double getDistance() {
        return 0.0;
    }

    public double getFullDecrease() {
        return 0.0;
    }

    public double getFullElevation() {
        double sum = 0.0;
        for (TrackPoint trackPoint : trackPoints) {
            sum += trackPoint.getElevation();
        }
        return sum;
    }

    public double getRectangleArea() {
        return (findMaximumCoordinate().getLatitude() - findMinimumCoordinate().getLatitude() * findMaximumCoordinate().getLongitude() - findMinimumCoordinate().getLongitude());
    }

    public List<TrackPoint> getTrackPoints() {
        return new ArrayList<>(trackPoints);
    }

    public void loadFromGpx(InputStream is) {
    }
}
