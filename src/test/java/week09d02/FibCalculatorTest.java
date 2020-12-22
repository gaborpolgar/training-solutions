package week09d02;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibCalculatorTest {

    @Test
    public void fiboTest(){
        FibCalculator calc = new FibCalculator();
        assertEquals(12, calc.sumEvens(6));
        assertEquals(33, calc.sumEvens(20));
    }


}