package week15d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CoordinateSystemTest {

    @Test
    void getMaxAndValueFromPoints() {
        List<Coordinate> coorindatesList = new ArrayList<>(List.of(new Coordinate(3, 15),new Coordinate( 23, 11) ));
        coorindatesList.add(new Coordinate(15, 12));
        coorindatesList.add(new Coordinate(5, 17));
        coorindatesList.add(new Coordinate(10, 10));
        Map<Integer, Integer> coordinates = new HashMap<>();
        for (Coordinate coord: coorindatesList) {
        coordinates.put(coord.getX(), coord.getY());
        }
        CoordinateSystem system = new CoordinateSystem();
        Coordinate result = system.getMaxAndValueFromPoints(coordinates);
        System.out.println(result.toString());
        assertEquals(new Coordinate(5, 17), system.getMaxAndValueFromPoints(coordinates));
    }
}