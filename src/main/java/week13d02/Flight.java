package week13d02;

import java.time.LocalTime;

public class Flight {

    private String number;
    private Goes go;
    private String city;
    private LocalTime time;



    public Flight(String number, Goes arrival, String city, LocalTime time) {
        this.number = number;
        this.go = arrival;
        this.city = city;
        this.time = time;
    }

    public String getNumber() {
        return number;
    }

    public Goes getGo() {
        return go;
    }

    public String getCity() {
        return city;
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "number='" + number + '\'' +
                ", go=" + go +
                ", city='" + city + '\'' +
                ", time=" + time +
                '}';
    }
}
