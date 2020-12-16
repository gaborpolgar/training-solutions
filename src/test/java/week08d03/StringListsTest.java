package week08d03;

import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StringListsTest {

    @Test
    public void stringListsTest(){
        StringLists list = new StringLists();
        List<String> first = Arrays.asList("alma", "körte", "banán");
        List<String> second = Arrays.asList("alma", "szőlő", "banán");
        List<String> excepted = Arrays.asList("alma", "körte", "banán", "szőlő");
        List<String> union = new ArrayList<>(list.stringListsUnion(first, second));
        assertIterableEquals(excepted, union);

    }

}