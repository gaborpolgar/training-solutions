package attributes.bill;

import java.util.Arrays;
import java.util.List;

public class BillMain {

    public static void main(String[] args) {
        Item item1 = new Item("monitor", 2, 10_000.5);
        Item item2 = new Item("laptop", 1, 50_000.0);
        Bill bill = new Bill();
        bill.addItem(item1);
        bill.addItem(item2);
        System.out.println(bill.calculateTotalPrice());
    }
}
