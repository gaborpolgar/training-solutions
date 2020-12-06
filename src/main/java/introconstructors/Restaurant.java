package introconstructors;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private String name;
    private List<String> menu = new ArrayList<>();
    private int capacity;

    public Restaurant(String name, int numberOfTables) {
        this.name = name;
        this.capacity = numberOfTables*4;
        addMenu();
    }

    public void addMenu() {
        menu.add("Gulyás");
        menu.add("Lecsó");
    }

    public String getName() {
        return name;
    }

    public List<String> getMenu() {
        return menu;
    }

    public int getCapacity() {
        return capacity;
    }
}
