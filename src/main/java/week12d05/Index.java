package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Index {

    private int counter;


    public int lineCounter(){
        Path file = Path.of("src\\main\\resources\\index.html");
        String line;
        int counter = 0;
        try {
            BufferedReader reader = Files.newBufferedReader(file);
        while (( line = reader.readLine()) != null) {
            line = reader.readLine();
            String findCovid = "koronavirus";
            counter = strCounter(line, findCovid, counter);
        }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
        return counter;
    }

    private int strCounter (String line, String findStr, int counter){
        if(line.contains(findStr)){
            counter++;
        }
        return counter;
    }
    }

