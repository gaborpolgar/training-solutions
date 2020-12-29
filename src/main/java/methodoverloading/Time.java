package methodoverloading;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;
    private Time time;

    public Time(int hours) {
        this.hours = hours;
    }

    public Time(Time time) {
        this.hours = time.hours;
        this.minutes = time.minutes;
        this.seconds = time.seconds;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public boolean isEqual(Time time){
        return true;
    }

    public boolean isEqual(int hours, int minutes, int seconds){
    return this.hours == hours && this.minutes == minutes && this.seconds == seconds;
    }

    public boolean isEarlier (Time time) {
        if (this.hours >= time.hours) {
            if (this.minutes >= time.minutes) {
                if (this.seconds >= time.seconds) ;
                return false;
            }
        }
        return true;
    }


    public boolean isEarlier(int hours, int minutes, int seconds){
  if (this.hours >= hours) {
            if (this.minutes >= minutes) {
                if (this.seconds >= seconds) ;
                return false;
            }
        }
        return true;
    }

    private int timeInSeconds(){
        return 3600*hours+ 60*minutes + seconds;
    }

}
