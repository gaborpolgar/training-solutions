package week10d02;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MaxTravelTest {

    @Test
    public void testTravel(){
       MaxTravel travel = new MaxTravel();
       //List<Integer> busStops = Arrays.asList(11, 11, 4, 5, 11, 20, 20, 1, 2, 4, 11);
       int result = travel.getMaxIndex(Arrays.asList(11, 11, 4, 5, 11, 20, 20, 1, 2, 4, 11));
       System.out.println(result);
       assertEquals(11, travel.getMaxIndex(Arrays.asList(11, 11, 4, 5, 11, 20, 20, 1, 2, 4, 11)));
    }

}