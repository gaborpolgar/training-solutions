package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CovidData {

    private List<String> threeMostValues;

    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("src\\main\\resources\\data.csv"))) {
            List<String> readedLines = new CovidData().readLines(reader);

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public List<String> readLines(BufferedReader reader) throws IOException {
        List<String> readedLines = new ArrayList<>();
        String line;
        reader.readLine();
        while ((line = reader.readLine()) != null) {
            if (line.contains("Hungary")) {
                readedLines.add(line);
            System.out.println(line);
            }
        }
        return readedLines;
    }

    public List<String> mostThreeWeeksCasesFromHun(List<String> readedlines) {
        //List<Integer
        Map<String, Integer> valuesByWeek = new HashMap<>();
        for (String line: readedlines) {
            String [] parts = line.split(",");
            valuesByWeek.put(parts[1], Integer.parseInt(parts[2]));
        }
        valuesByWeek.values();


        return threeMostValues;
    }

}
