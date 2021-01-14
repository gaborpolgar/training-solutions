package week11d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisonFinderTest {

    @Test
    public void testNumber(){
        DivisonFinder div = new DivisonFinder();
        assertEquals(1, div.findDivisors(425));
        assertEquals(0, div.findDivisors(29));
        assertEquals(2, div.findDivisors(15));


    }

}