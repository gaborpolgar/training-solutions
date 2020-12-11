package week07d05;

public enum TransmissionType {

    MANUAL(5),
    AUTOMATIC(0),
    SEQUENTIAL(5);


    TransmissionType() {
        this.gear = 5;
    }

    private final int gear;

    TransmissionType(int gear) {
        this.gear = gear;
    }

    public int getGEAR() {
        return gear;
    }
}

