package week11d02;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    public List<String> wordsWithChar(List<String> words, char c){
        List<String> results = new ArrayList<>();

        for (String word: words) {
            if (word.contains(String.valueOf(c))){
                results.add(word);
            }
        }
        return results;
    }
}
