package week10d05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {

    public static void main(String[] args) {
        int [] arr = {1, 4, 8, 5, 10, 11};
        System.out.println(findMinSum(arr));

    }


    public static int findMinSum(int [] arr){
        if  ( arr.length <4 ){
            throw new IllegalArgumentException("The numbers must be at least four!");
        }
        List<Integer> arrAsList = Arrays.stream(arr)
                .boxed().sorted()
                .collect(Collectors.toList());
        System.out.println(arrAsList.toString());
        int result = 0;
        for (int i = 0; i < 4; i++) {
        result += arrAsList.get(i);
        }
    return result;
    }
}
