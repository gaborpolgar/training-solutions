package ioreader.grades;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Integer> grades = new ArrayList<>();
    
    public Student(String name, List<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public double average(){
        int sum = 0;
        for (int grade: grades) {
            sum += grade;
        }
        double amount = grades.size();
        return sum/amount;
    }

    public boolean isIncreasing(){
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i+1) >= grades.get(i)){
                continue;
        } else {
                return false;
            }
        }
        return true;
    }
}
