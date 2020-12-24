package stringbuilder;

import java.util.Locale;

public class PalindromeValidator {

    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
    }

    public static boolean isPalindrome (String word){
        if (word == null){
            throw new IllegalArgumentException("Text must not be null!");
        }
        return new StringBuilder(word.toLowerCase().trim()).reverse().toString().equals(word.toLowerCase().trim());
    }
}
