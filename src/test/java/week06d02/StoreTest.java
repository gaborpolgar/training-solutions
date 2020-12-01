package week06d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @Test
     void testCategory(){
        Product samsung = new Product("Samsung", Category.BAKEDGOODS, 40000);
        Product lg = new Product("LG", Category.BAKEDGOODS, 35000);
        Product verbatimSsd = new Product("verbatim", Category.DAIRY, 20000);

        List<Product> lists = Arrays.asList(samsung, lg, verbatimSsd);

        Store hardShop = new Store(lists);

        assertEquals(2,hardShop.getProductByCategoryName(Category.BAKEDGOODS) );


    }

}