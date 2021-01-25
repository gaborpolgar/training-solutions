package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class GetTheLongestNamedCity {

    public static void main(String[] args) {
        GetTheLongestNamedCity get = new GetTheLongestNamedCity();
        System.out.println(get.getLongestCity());
    }

    public String getLongestCity (){
        Path file = Path.of("src\\main\\resources\\iranyitoszamok-varosok-2021.csv");
        try (BufferedReader reader = new BufferedReader(Files.newBufferedReader(file))){
            String line = "";
            String longestCity = "";
            while ((line = reader.readLine()) != null){
                String [] strs = line.split(";");
                if (strs[1].length() > longestCity.length()){
                    longestCity = strs[1];
                }
            }
            return longestCity;
        } catch (IOException ioe) {
            throw new IllegalStateException("The file can not read.", ioe);
        }
    }
}
