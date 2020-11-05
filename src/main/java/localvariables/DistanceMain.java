package localvariables;

public class DistanceMain {

    public static void main(String[] args) {

        Distance distance = new Distance(42.144, true);
        System.out.println(distance.getDistanceInKm());
        int integer = (int) distance.distanceInKm;
        System.out.println(integer);


    }
}
