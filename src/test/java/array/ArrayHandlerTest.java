package array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayHandlerTest {
        int [] ints = {1,2,3};
        ArrayHandler handler = new ArrayHandler();
    @Test
    public void testing () {

        Assert.assertEquals(true, handler.contains(ints, 2));
    }
    @Test
    public void testTwo() {
        Assert.assertEquals(2, handler.find(ints, 2));
    }
}