package week04d02;

import java.util.ArrayList;
import java.util.List;

public class Search {

    public static void main(String[] args) {
        Search s = new Search();
        List<Integer> positions = s.getIndexesOfChar("almafa", 'a');
        for (int i = 0; i < positions.size(); i++) {
            System.out.println(positions.get(i));
        }
    }

    public List<Integer> getIndexesOfChar(String value, char c){
        List<Integer> charIndexes = new ArrayList<>();
        for (int i = 0; i < value.length(); i++) {
            if(value.charAt(i) == c){
                charIndexes.add(i);
            }
        }
        return charIndexes;
    }
}
