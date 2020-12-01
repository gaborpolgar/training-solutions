package week06d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @Test
     void testCategory(){
        Product samsung = new Product("Samsung", "Monitor", 40000);
        Product lg = new Product("LG", "Monitor", 35000);
        Product verbatimSsd = new Product("verbatim", "SSD", 20000);

        List<Product> lists = Arrays.asList(samsung, lg, verbatimSsd);

        Store hardShop = new Store(lists);

        assertEquals(2,hardShop.getProductByCategoryName("Monitor") );


    }

}