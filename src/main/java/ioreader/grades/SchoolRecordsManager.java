package ioreader.grades;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SchoolRecordsManager {

    private List<Student> students = new ArrayList<>();

        public void readRecords(){
            Path file = Path.of("\\grades.txt");
            try (BufferedReader reader = Files.newBufferedReader(file)){
                String line;
                while( (line = reader.readLine()) != null){
                line = reader.readLine();
                String [] temp = line.split(" ");
                List<Integer> grades = new ArrayList<>();
                    for (int i = 0; i < temp.length; i++) {
                        grades.add(Integer.parseInt(temp[i]));
                    }
                    Student s = new Student (temp[0], grades);
                    students.add(s);
                }
            } catch (IOException e) {
                throw new IllegalStateException("Can't read file.", e);
            }

        }
}
