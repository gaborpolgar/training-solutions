package week06d02;

public class Product {

    private String name;
    private String category;
    private int price;

    public String getCategory() {
        return category;
    }

    public Product(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
}
