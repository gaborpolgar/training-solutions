package introdate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Performance {

    private LocalDate date;
    private String artist;
    private LocalTime startTime;
    private int startHour;
    private int startMinute;
    private int endHour;
    private int EndMinute;

    public Performance(String artist, LocalDate date, int startHour, int startMinute, int endHour, int endMinute) {
        this.date = date;
        this.artist = artist;
        this.startTime = LocalTime.of(startHour, startMinute);
        this.endTime = LocalTime.of(endHour, endMinute);
    }

    private LocalTime endTime;

    public LocalDate getDate() {
        return date;
    }

    public String getArtist() {
        return artist;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void getInfo(){
        System.out.println(getArtist() + ": " + getDate() + " " + getStartTime().format(DateTimeFormatter.ofPattern("hh:mm")) + " - " + getEndTime() );
    }
}
