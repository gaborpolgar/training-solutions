package methodchain.robot;

public class NavigationPoint {

    private int actualDistance;
    private int actualAzimut;


    public NavigationPoint(int actualDistance, int actualAzimut) {
        this.actualDistance = actualDistance;
        this.actualAzimut = actualAzimut;
    }

    public int getActualDistance() {
        return actualDistance;
    }

    public int getActualAzimut() {
        return actualAzimut;
    }

    @Override
    public String toString() {
        return "NavigationPoint{" +
                "actualDistance=" + actualDistance +
                ", actualAzimut=" + actualAzimut +
                '}';
    }
}
