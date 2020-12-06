package introconstructors;

public class RestaurantMain {
    public static void main(String[] args) {
    Restaurant rest = new Restaurant("Costes", 4);
        System.out.println(rest.getCapacity());
        System.out.println(rest.getMenu());
    }

}
