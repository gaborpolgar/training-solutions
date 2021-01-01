package constructoroverloading.bus;

public class SimpleTime {

    private int hours;
    private int minutes;

    public SimpleTime(int hours) {
        this(hours, 0);
    }

    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(SimpleTime time) {
        this (time.hours, time.minutes);
    }

    public int difference (SimpleTime time){
        return Math.abs((time.hours*60 + time.minutes) - (this.hours*60 + this.minutes));
    }

    @Override
    public String toString() {
        return "The time: " + this.hours +
                ":" + this.minutes;
    }
}
