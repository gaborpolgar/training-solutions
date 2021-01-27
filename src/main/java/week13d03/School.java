package week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class School {

    public int findClassPerWeekByTeacher(String teacher) {
        Map<String, Integer> teachers = new HashMap<>();
        Path file = Path.of("src\\main\\resources\\beosztas.txt");
        int number;
        int solution = 0;
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            String actualTeacher = "";
            while ((line = reader.readLine()) != null) {
                if (line.split(" ").length == 2) {
                    teachers.putIfAbsent(line, 0);
                    actualTeacher = line;
                }
                if (isInteger(line)) {
                    teachers.put(actualTeacher, teachers.get(actualTeacher) + Integer.parseInt(line));
                    //teachers.replace(actualTeacher, teachers.get(actualTeacher), teachers.get(actualTeacher + Integer.parseInt(line)));
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("File can not read.", ioe);
        }
        System.out.println(teachers.toString());
        for (Map.Entry<String, Integer> teach : teachers.entrySet()) {
            if (teacher.equals(teach.getKey())) {
                if (teach.getValue() != null) {
                    solution = teach.getValue();
                }
            }
        }
        return solution;
    }


    public boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

