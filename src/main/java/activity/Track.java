package activity;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint (TrackPoint point){
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

    public Coordinate findMinimumCoordinate(){
    return new Coordinate(0, 0);
    }

    public double getDistance(){
return 0.0;
    }

    public double getFullDecrease (){
return 0.0;
    }

    public double getFullElevation(){
return 0.0;
    }

    public double getRectangleArea(){
return 0.0;
    }

    public List<TrackPoint> getTrackPoints(){
    return new ArrayList<>();
    }

}
