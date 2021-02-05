package week14d03;

import java.util.Collections;
import java.util.List;

public class ClassNotebook {

    private List<Student> students;

    public ClassNotebook(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Student> sortNotebook(){
        Collections.sort(students);
        students.stream().map(s -> s.getName()).forEach(System.out::print);
        return students;
    }

}
