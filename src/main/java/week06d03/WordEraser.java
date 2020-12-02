package week06d03;

public class WordEraser {

    public String eraseWord(String words, String word) {
        String wordsOfArray[] = words.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordsOfArray.length; i++) {
            if (!wordsOfArray[i].contains(word)) {
                sb.append(wordsOfArray[i]);
                    sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}
