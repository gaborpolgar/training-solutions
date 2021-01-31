package week13d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TemplateMerger {

    public static void main(String[] args) {
    Path file = Path.of("src\\main\\resources\\template.txt");
    List<Employee> employees = new ArrayList<>();
            Employee employee1 = new Employee("John Doe", "1980");
            Employee employee2 = new Employee("Jack Doe", "1990");
    employees.add(employee1);
    employees.add(employee2);
        System.out.println(merge(file, employees));

    }

    public static String merge(Path file, List<Employee> employees){
        String solution;
        try{
            String text = Files.readString(file);
            String [] twoParts = text.split(",");
            String []first = twoParts[0].split(":");
            String [] second = twoParts[1].split(":");
            solution = first[0] + ": " + employees.get(0).getName() + ", " + second[0] + ": " + employees.get(0).getBirthOfYear()
            + "\n" +  first[0] + ": " + employees.get(1).getName() + ", " + second[0] + ": " + employees.get(1).getBirthOfYear();
        }
        catch (IOException ioe){
            throw new IllegalStateException("Can not read the file", ioe);
        }

    return solution;
    }


}
