package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Histogram {

    public String createHistogram(BufferedReader reader) {
        String line;
        StringBuilder sb = new StringBuilder();
            try {
                while ((line = reader.readLine()) != null){
                    for (int i = 0; i < Integer.parseInt(line); i++) {
                        sb.append("*");
                    }
                    sb.append("\n");
                };
            } catch (IOException ioe) {
                throw new IllegalArgumentException("The file reading failed.", ioe);
            }
            return sb.toString();
    }

    public static void main(String[] args) {
        try(BufferedReader reader = Files.newBufferedReader(Path.of("src\\main\\resources\\histogram.txt"))){
            new Histogram().createHistogram(reader);
        } catch (IOException ioe) {
           throw new IllegalStateException("Can not read the file.", ioe);
        }
    }

}
