package week05d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCounter {

    public List<String> stringList;


    public ListCounter(String... strings) {
        stringList = Arrays.asList(strings);
    }

    public int counter(List<String> stringList) {
        int counter = 0;
        if (stringList.isEmpty() || stringList.size() == 0) {
            return 0;
        }
        for (String string : stringList) {
            if (string.toLowerCase().charAt(0) == 'a')
                counter++;
        }
        return counter;
    }
}

