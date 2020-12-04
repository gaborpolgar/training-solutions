package week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    private List<Item> items = new ArrayList<>();

    public Budget(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItemsByMonth(int month) throws IllegalArgumentException{
        if (month > 12 || month < 1){
            throw new IllegalArgumentException("Not acceptable month.");
        }
        List<Item> itemsByMonth = new ArrayList<>();
        for (Item item: items) {
            if (item.getMonth() == month){
                itemsByMonth.add(item);
            }
        }
        return itemsByMonth;
    }
}
