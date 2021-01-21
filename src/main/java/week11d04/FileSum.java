package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSum {

    public static void main(String[] args) {

    }

    public int readFile (String name){
        try{
            return Integer.parseInt(Files.readString(Path.of(name)));

        } catch (IOException e){
            throw new IllegalStateException("Can not read file", e);
        }
    }

    public void sumNumbers(String [] path){
        int sum = 0;
        String filename;
        for (int i = 0; i < 100; i++) {
            filename= String.format("number%02.txt", i);
        if (Files.isRegularFile(Path.of(filename))){
            sum += readFile(filename);
        }
        }
    }
}
