package week14d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.PasswordAuthentication;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCounterByLines {

    private static final Path FILE =Path.of("src\\main\\resources\\hachiko.srt");

    public static void main(String[] args) {
        WordCounterByLines counter = new WordCounterByLines();
        System.out.println(counter.countWords(FILE, "Hachiko", "haza", "pályaudvar", "jó" ));
    }


    public Map<String, Integer> countWords(Path file, String...words){
        String line;
        Map<String, Integer> countedLines = new HashMap<>();
        for (String word: words) {
            countedLines.put(word, 0);
        }
        try {
            BufferedReader reader = Files.newBufferedReader(file);
            while ((line = reader.readLine()) != null){
                String [] parts = line.split(" ");
                if (parts.length > 1){
                    for (int i = 0; i < words.length; i++) {
                        for (int j = 0; j < parts.length; j++) {
                            if (words[i].equals(parts[j])){
                                countedLines.put(words[i], countedLines.containsKey(words[i])? countedLines.get(words[i])+1 : 1);
                        }

                        }

                    }
                }

            }
        } catch (IOException ioe) {
            throw new IllegalStateException("The file can not read.", ioe);
        }


        return countedLines;
    }
}
