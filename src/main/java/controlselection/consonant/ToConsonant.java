package controlselection.consonant;

public class ToConsonant {

    public static void main(String[] args) {
        System.out.println(toConsonant('e'));


    }

    public static final String VOWELS ="aeiouy";

    public static char toConsonant(char c) {
        System.out.println(c);
        int i = c+1;
        char j = (char) i;
        System.out.println(j);
        System.out.println((char)(c+1));
        if (VOWELS.indexOf(c) >= 0){
            return (char) (c+1);
        } else {
            return c;
        }
    }
}
