package week05d03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListCounterTest {

    @Test
    void counter() {

        ListCounter list = new ListCounter("Alma", "aladar", "tamas");

        int result = list.counter(list.stringList);
        assertEquals(2, result);


    }
}