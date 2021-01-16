package exceptionclass.course;

public class SimpleTime {

    private int hour;
    private int minute;
    private String hhmm;

    public SimpleTime(int hour, int minute) {
        this.hour = hour;

        if (hour > 23 || hour < 0){
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        if (this.minute > 59 || this.minute < 0){
            throw new InvalidTimeException("Minute is invalid (0-23)");
        }
        this.minute = minute;
    }

    public SimpleTime(String hhmm) {
        this.hhmm = hhmm;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString() {
        if (hhmm == null) {
            return hour + ":" + minute;
        } else {
            return hhmm;
        }
    }
}

