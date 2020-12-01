package week06d02;

import java.util.List;

public class Store {

    private List<Product> productList;

    public Store(List<Product> productList) {
        this.productList = productList;
    }

    public int getProductByCategoryName(String category){
        int counter= 0;
        for (Product prod: productList) {
           if (prod.getCategory().equals(category)){
               counter ++;
            }
        }
        return counter;
    }
}
