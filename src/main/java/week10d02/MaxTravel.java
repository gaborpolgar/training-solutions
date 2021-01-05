package week10d02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxTravel {

    public static void main(String[] args) {
       System.out.println(new MaxTravel().getMaxIndex(new ArrayList<Integer>(List.of(11, 11, 4, 5, 11, 20, 20, 1, 2, 4, 11))));
    }

    //private List<Integer> busStops = new ArrayList<>();

    public int getMaxIndex(List <Integer> busStops){
        System.out.println(busStops.toString());
        Collections.sort(busStops);
        System.out.println(busStops.toString());
        int counter = 1;
        int index = 0;
        int maxBusStop = busStops.get(0);
        for (int i = 0; i < busStops.size()-1; i++) {
            if (busStops.get(i).equals(busStops.get(i+1))){
                counter++;
                if (i == busStops.size()-2){
                    if (counter > index){
                        maxBusStop = busStops.get(i);
                    }
                }
            } else {
                if (counter > index){
                    index = counter;
                    maxBusStop = busStops.get(i);
                }
                counter = 1;
                }
            }
        return maxBusStop;
        }
    }


