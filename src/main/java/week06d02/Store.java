package week06d02;

import java.util.List;

public class Store {

    private List<Product> productList;

    public Store(List<Product> productList) {
        this.productList = productList;
    }

    public int getProductByCategoryName(Category category){
        int counter= 0;
        for (Product prod: productList) {
           if (prod.category.equals(category)){
               counter ++;
            }
        }
        return counter;
    }
}
