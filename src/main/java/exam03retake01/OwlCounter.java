package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {

    private Map<String, Integer> owlsByCounty = new HashMap<>();
//    private String county;
//    private long numberOfOwls;
//    private Path file = Path.of("/owls.txt");
//    private BufferedReader reader = Files.newBufferedReader(file);

//    public static void main(String[] args) {
//        OwlCounter owlCounter = new OwlCounter();
//        Path file = Path.of("owls.txt");
//        try (BufferedReader reader = Files.newBufferedReader(file)) {
//            owlCounter.readFromFile(reader);
//            System.out.println(owlCounter.getNumberOfOwls("Zala"));
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public void readFromFile(BufferedReader reader) throws IOException{
        String line;
                while ((line = reader.readLine()) != null){
                String []parts = line.split("=");
                String county = parts[0];
                    System.out.println(county);
                int owls = Integer.parseInt(parts[1]);
                    System.out.println(owls);
                    owlsByCounty.put(county, owls );
                }
        System.out.println(owlsByCounty);
    }

    public long getNumberOfOwls(String county){
        return owlsByCounty.get(county);
    }

}
