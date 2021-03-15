package activitytrackerdao;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class FileReader {

    Map<String, String> cities = new HashMap<>();

    Path file = Path.of("cities.csv");

    public Map<String, String> readFromFileCities() {
        try (BufferedReader reader = Files.newBufferedReader(file)) {
        String line;
        reader.readLine();
        while((line = reader.readLine()) != null){
            String [] parts = line.split(";");
            cities.put(parts[0], parts[1]);
        }
            return cities;
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read the file", ioe);
        }
    }
}
