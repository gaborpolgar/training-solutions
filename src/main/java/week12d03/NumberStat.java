package week12d03;

import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class NumberStat {

    public static void main(String[] args) throws IOException {
        Path file = Path.of("numbers.txt");
        List<String> numbers = Files.readAllLines(file);
        System.out.println(numbers.toString());
            List<Integer> numbersList = new ArrayList<>();
        for (String number: numbers) {
            String [] arr = number.split(",");
            System.out.println(Arrays.toString(arr));
            for (int i = 0; i < arr.length; i++) {
                numbersList.add(Integer.parseInt(arr[i]));
            }
        }
        System.out.println(numbersList.toString());

        System.out.println(foundOnce(numbersList));
    }

    public static int foundOnce (List<Integer> numbers){
        if ( numbers.size() == 0){
            throw new IllegalArgumentException("The array must be contain at least one number! ");
        }
        int result = 0;
        Map<Integer, Integer> numberFrequency = new HashMap<>();
        for (int numb: numbers) {
        numberFrequency.put(numb, numberFrequency.containsKey(numb) ? numberFrequency.get(numb)+ 1 : 1);
        }
            List<Integer> resultList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> pairs : numberFrequency.entrySet()) {
            if (pairs.getValue() == 1){
                resultList.add(pairs.getKey());
            }
            }
        result = Collections.min(resultList);
        System.out.println(result);
        return result;
        }
    }
