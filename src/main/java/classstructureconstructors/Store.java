package classstructureconstructors;

public class Store {

    private String product;
    private int stock= 0;

    public Store(String product) {
        this.product = product;
    }

    public void store(int incomming){
        stock = stock + incomming;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public void dispatch(int deliveringItem){
    stock = stock - deliveringItem;
    }
}
