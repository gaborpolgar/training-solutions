package week10d01;

import java.util.ArrayList;
import java.util.List;

public class Hiking {

    public static void main(String[] args) {
        System.out.println(getPlusElevation(new ArrayList<Double>(List.of(10.4, 5.1, 30.0, 40.0))));
    }

    private List<Double> heights;

    public static double getPlusElevation(List<Double> heights){
        double sumOfRising = 0.0;
        for (int i = 0; i < heights.size()-1; i++) {
            if (heights.get(i) < heights.get(i+1)){
                sumOfRising += heights.get(i+1) - heights.get(i);
        }
        }
        return sumOfRising;
    }
}
