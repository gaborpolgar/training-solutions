package statements;

public class Time {

    private int minute;
    private int second;
    private int hour;

    public Time(int hour, int minute, int second) {
        this.minute = minute;
        this.second = second;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getInMinutes(){
        return (getHour()*60) + getMinute();
    }

    public int getInSeconds(){
        return getInMinutes()*60;
    }

    public boolean earlierThan(Time time){
        return (this.getInSeconds() < time.getInSeconds());
    }

    @Override
    public String toString() {
        return  hour + ":" + minute + ":" + second;
    }
}

