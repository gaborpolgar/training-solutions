package classstructureconstructors;

public class StoreMain {

    public static void main(String[] args) {
        Store store = new Store("laptop");
        System.out.println("recent stock: " + store.getStock());
        store.store(10);
        System.out.println(store.getProduct() + ": " + store.getStock());
        store.dispatch(7);
        System.out.println("Remaining: ");
        System.out.println(store.getProduct() + ": " + store.getStock());

        Store anotherStore = new Store( "monitor");
        anotherStore.store(542);
        System.out.println(anotherStore.getProduct() + ": " + anotherStore.getStock());
        anotherStore.dispatch(400);
        System.out.println(anotherStore.getProduct() + ": " + anotherStore.getStock());


    }
}
