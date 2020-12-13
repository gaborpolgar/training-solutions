package week02d03;

public class Product {

    public static void main(String[] args) {
        Product prod = new Product("az", "111");
        Product prod2 = new Product("az", "11111");
        System.out.println(prod.areTheyEqual(prod2));
        System.out.println(prod.areTheyEqualStrict(prod2));
    }

    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public boolean areTheyEqual(Product product){
        return name == product.name;
    }

    public boolean areTheyEqualStrict (Product product){
        return Math.abs(code.length()-product.code.length())  <= 1;
    }
}
