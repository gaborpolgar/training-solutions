package exam03retake02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.Collator;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BalatonStorm {

    BufferedReader reader;

    public static void main(String[] args) throws IOException {
        Path file = Path.of("storm.json");
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            new BalatonStorm().getStationsInStorm(reader);
        }
    }

    public List<String> getStationsInStorm(BufferedReader reader){
        try {
            String line;
            List<Integer> levels = new ArrayList<>();
            List<String> stations = new ArrayList<>();
            while ((line = reader.readLine()) != null){
//                System.out.println(line);
                if (line.contains("level\":")){
                    String [] levelparts = line.split(":");
//                    System.out.println(levelparts[1]);
                    int level = Integer.parseInt(levelparts[1].trim().substring(0, 1));
//                    System.out.println(level);
                    levels.add(level);
                }
                if(line.contains("allomas")){
                    String [] parts = line.split(":");
                    String [] elements = parts[1].split("\"");
//                    System.out.println(Arrays.toString(parts));
//                    System.out.println(elements[1]);
//                    stations.add(elements[1]);
                    }
            }
//            System.out.println(levels.size());
//            System.out.println(stations.size());
            List<String> results = new ArrayList<>();
            for (int i = 0; i < levels.size(); i++) {
//                System.out.println("------");
//                System.out.println(levels.get(i));
                if (levels.get(i) == 3){
                    results.add(stations.get(i));
                }
            }
//            System.out.println(results);
            results.sort(Collator.getInstance(new Locale("hu", "HU")));
//            System.out.println(results.toString());
            return results;
        } catch (IOException ioe){
            throw new IllegalStateException("Cannot read file!", ioe);
        }
    }
}
