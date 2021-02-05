package week14d03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student implements Comparable<Student>{

    private String name;
    private Map<String, List<Integer>> log = new HashMap<>();


    public static void main(String[] args) {
        Map<String, List<Integer>> myDiary = new HashMap<>();
        myDiary.put("biology", List.of(4, 3, 1, 2));
        Map<String, List<Integer>> aladarDiary = new HashMap<>();
        aladarDiary.put("literature", List.of(5, 5, 4, 3, 5));
        Student polgarg = new Student("Gabor", myDiary);
        Student aladar = new Student("Aladar", aladarDiary);
        ClassNotebook book = new ClassNotebook(List.of(polgarg, aladar));
        System.out.println(book.toString());
        System.out.println(book.sortNotebook());

    }

    public String getName() {
        return name;
    }

    public Student(String name, Map<String, List<Integer>> log) {
        this.name = name;
        this.log = log;
    }

    @Override
    public int compareTo(Student other) {
        return this.getName().compareTo(other.getName());
    }

    public void writeMark(String subject, int mark){
        for (Map.Entry<String, List<Integer>> sub : log.entrySet()) {
            if (subject.equals(sub.getKey())){
                List<Integer> temp = new ArrayList<>(sub.getValue());
                temp.add(mark);
                sub.setValue(temp);
            }


        }
    }
}
