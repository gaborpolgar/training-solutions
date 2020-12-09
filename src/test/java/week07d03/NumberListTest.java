package week07d03;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NumberListTest {

    @Test
    public void increasingTest() {
        NumberList list = new NumberList();
        assertTrue(list.isIncreasing(Arrays.asList(1, 1, 3, 3, 4, 5, 6, 7, 8, 9, 100, 100_000)));
    }

    @Test
    public void increasingTestFailure() {
        NumberList list = new NumberList();
        assertFalse(list.isIncreasing(Arrays.asList(1, 1, 5, 3, 4, 5, 100, 7, 8, 9, 100, 100_000)));
    }


}