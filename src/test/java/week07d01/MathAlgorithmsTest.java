package week07d01;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathAlgorithmsTest {
    @Test
    public void test2 (){
        Assert.assertTrue(MathAlgorithms.isPrime(2));
    }
@Test
    public void testMinus (){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> MathAlgorithms.isPrime(-2));
    }
@Test
    public void testThree (){
        Assert.assertTrue(MathAlgorithms.isPrime(3));
    }
@Test
    public void testFour (){
        Assert.assertFalse(MathAlgorithms.isPrime(4));
    }
@Test
    public void testThreeten (){
        Assert.assertTrue(MathAlgorithms.isPrime(13));
    }@Test
    public void testTwelve (){
        Assert.assertFalse(MathAlgorithms.isPrime(12));
    }


}