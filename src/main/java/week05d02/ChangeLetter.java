package week05d02;

public class ChangeLetter {

    public static void main(String[] args) {
        ChangeLetter word = new ChangeLetter();
        System.out.println(word.changeVowels("alekosz"));
    }

    private char [] vowels = {'a', 'e', 'i', 'o', 'u'};
    private int [] toStarChars;

    String changeVowels(String text){
        System.out.println(text);
            for(int i = 0; i < text.length(); i++){
                for (int j= 0; j < vowels.length; j++){
                    if (text.charAt(i) == vowels[j]){
                       text = text.replace(text.charAt(i), '*');

                    }
            }
        }
            return text;
    }
}
