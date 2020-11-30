package week06d01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSelector {

    public static void main(String[] args) {
        //List<String> testList = Arrays.asList("egy", "kettő", "három", "négy");
        List<String> testList = new ArrayList<>();
        testList.add(null);
        System.out.println(getStringInSquereBraclets(testList));
    }

    public static String getStringInSquereBraclets (List<String> texts) throws IllegalArgumentException {
        if(texts.isEmpty()){
            return "üres";
        } else if (texts.get(0) == null){
             throw new IllegalArgumentException("Hiba! Nulla elemű a lista.");

        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < texts.size(); i++) {
            if(i % 2 != 0){
                sb.append(texts.get(i));
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
