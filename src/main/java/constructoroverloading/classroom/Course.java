package constructoroverloading.classroom;

public class Course {

    private int participants;
    private Facility facilityNeeded;

    public Course(int participants, Facility facilityNeeded) {
        this.participants = participants;
        this.facilityNeeded = facilityNeeded;
    }
}
