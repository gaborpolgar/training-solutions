package attributes.bill;

public class Item {

    private String product;
    private int quantity;
    private double price;

    public int getQuantity() {
        return quantity;
    }

    public Item(String product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
