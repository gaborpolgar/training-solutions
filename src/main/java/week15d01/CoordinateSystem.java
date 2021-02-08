package week15d01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class CoordinateSystem {

    public Coordinate getMaxAndValueFromPoints(Map<Integer, Integer> somePoints){
            List<Integer> y = new ArrayList<>(somePoints.values());
        Collections.sort(y);
        int maxY = y.get(y.size()-1);
        int xForMaxY = 0;
        for (Map.Entry<Integer, Integer> point : somePoints.entrySet()) {
            if (point.getValue().equals(maxY)){
                xForMaxY = point.getKey();
            }
        }
        return new Coordinate(xForMaxY, maxY);
    }
}
