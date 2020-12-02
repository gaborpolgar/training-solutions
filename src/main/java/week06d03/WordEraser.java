package week06d03;

public class WordEraser {

    public String eraseWord (String words, String word){
        String wordsOfArray[] = words.split(" ");
        for (String examinedW : wordsOfArray){
            if(examinedW.contains(word)){
                examinedW = "";
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordsOfArray.length; i++) {
            sb.append(wordsOfArray[i]);
            sb.append(" ");

        }
        return sb.toString();
    }
}
