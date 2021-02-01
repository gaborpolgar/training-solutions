package week13d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Flights {

    private List<Flight> flights = new ArrayList<>();

    public static void main(String[] args) {
        Flights flight = new Flights();
        List<Flight> flights = flight.test();
       // System.out.println(flight.mostWay());
        System.out.println(flight.getFlightByNumber("EJ9251"));
        System.out.println(flight.getFlightsByCity("Berlin"));
        System.out.println(flight.getEarliestFlight());
    }

    private Flight getEarliestFlight() {
        LocalTime result = LocalTime.of(23, 59);
        Flight solution = null;
        for (Flight flight: flights) {
            if (flight.getTime().isBefore(result)){
                result = flight.getTime();
                solution = flight;
            }
        }
        return solution;
    }

    private List<Flight> getFlightsByCity(String city) {
    List<Flight> flightsByCity = new ArrayList<>();
        for (Flight flight: flights) {
            if (city.equals(flight.getCity())){
                flightsByCity.add(flight);
            }
        }
        return flightsByCity;
    }


    private Flight getFlightByNumber(String number) {
        for (Flight flight: flights) {
           if (number.equals(flight.getNumber())){
               return flight;
           }
        }
        throw new NullPointerException("I can not find flight with this number");
    }

    private Goes mostWay() {
        int counter = 0;
        for (Flight flight: flights) {
            if (flight.getGo().equals(Goes.ARRIVAL)){
                counter++;
            } else {
                counter--;
            }
        }
        if (counter > 0){
            return Goes.ARRIVAL;
        } else if (counter <0){
            return Goes.DEPARTURE;
        } else {
            throw new IllegalStateException("That flight ways is equal.");
        }
    }



    public List<Flight> test() {
        Path file = Path.of("src\\main\\resources\\cities.txt");
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                String[] time = parts[3].split(":");
                int hour = Integer.parseInt(time[0]);
                int minute = Integer.parseInt(time[1]);
                flights.add(new Flight(parts[0], parts[1].equals("Arrival") ? Goes.ARRIVAL : Goes.DEPARTURE, parts[2], LocalTime.of(hour, minute)));
            }
            System.out.println(flights.toString());

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file.", ioe);
        }
    return flights;
    }
}
