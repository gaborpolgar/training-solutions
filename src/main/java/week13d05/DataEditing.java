package week13d05;

import java.util.ArrayList;
import java.util.List;

public class DataEditing {

    public int countingDifferentLetters(String word){
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        List<Character> usedChars = new ArrayList<>();
        word = word.trim().toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
            if (word.charAt(i) == alphabet[j]){
                if (usedChars.contains(alphabet[j])){
                    break;
                } else {
                    usedChars.add(alphabet[j]);
                }
            }
            }
        }
        return usedChars.size();
    }
}
