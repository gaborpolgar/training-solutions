package activity;

public class Coordinate {

    private double latitude;
    private double longitude;

    public Coordinate(double latitude, double longitude) {
        if (latitude < -90 || latitude > 90){
            throw new IllegalArgumentException("The latitude value must to be between -90 and 90!");
        }
        this.latitude = latitude;
        if ( longitude <-180 || longitude > 180){
            throw new IllegalArgumentException("The longitude value must to be between -180 and 180!");

        }
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
