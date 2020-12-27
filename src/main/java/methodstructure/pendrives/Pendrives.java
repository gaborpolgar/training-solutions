package methodstructure.pendrives;

import java.util.List;

public class Pendrives {

    public Pendrive best(List<Pendrive> pendrives){
        Pendrive min = pendrives.get(0);
        for (int i = 0; i < pendrives.size(); i++) {
            if (min.comparePriceperCapacity(pendrives.get(i)) == 1){
                min = pendrives.get(i);
            }
        }
        return min;
    }
    public Pendrive cheapest(List<Pendrive> pendrives) {
        Pendrive min = pendrives.get(0);
        for (int j = 0; j < pendrives.size(); j++) {
            if (pendrives.get(j).cheaperThan(min)) {
                min = pendrives.get(j);
            }
        }
        return min;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendrives, int percent, int capacity) {
        for (Pendrive p : pendrives) {
            if (p.getCapacity() == capacity) {
                p.risePrice(percent);
            }
        }
    }
}
