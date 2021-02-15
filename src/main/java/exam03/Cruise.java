package exam03;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public void bookPassenger (Passenger passenger){
        if (passenger == null){
            throw new IllegalArgumentException("This passenger is not to be null");
        }
        if (this.passengers.size() == this.boat.getMaxPassengers()){
            throw new IllegalArgumentException("Not enough seat in this Boat for " + passenger + ".");
        }
            passengers.add(passenger);
    }

    public double getPriceForPassenger (Passenger passenger){
        return this.basicPrice * passenger.getCruiseClass().getMultiplier();
    }

    public Passenger findPassengerByName(String name){
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("The name is must be valid");
        }
        for (Passenger passenger : passengers) {
            if (name.equals(passenger.getName())){
                return passenger;
            }
    }
        throw new IllegalArgumentException("This passenger can not find on this boat");
    }

    public List<String> getPassengerNamesOrdered(){
        List<String> result = new ArrayList<>();
        for (Passenger passenger : passengers) {
            result.add(passenger.getName());
        }
        Collections.sort(result);
        return result;
    }

    public double sumAllBookingsCharged(){
        double sum = 0.0;
        for (Passenger passenger : passengers) {
           sum += getPriceForPassenger(passenger);
        }
//        return basicPrice * passengers.size();
        return sum;
    }

    public Map<CruiseClass, Integer> countPassengerByClass(){
        Map<CruiseClass, Integer> result = new HashMap<>();
        for (Passenger passenger : passengers) {
            result.put(passenger.getCruiseClass(), result.containsKey(passenger.getCruiseClass())? result.get(passenger.getCruiseClass())+1 : 1);
        }
        return result;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return new ArrayList<>(passengers);
    }
}
