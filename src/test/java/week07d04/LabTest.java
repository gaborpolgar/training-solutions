package week07d04;

import org.apache.tools.ant.taskdefs.Local;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LabTest {

    @Test
    public void LabTest(){
        Lab task1 = new Lab(" java home work");
        Lab task2 = new Lab("dish washing", LocalDate.of(2020,12,9));
        assertEquals("Title:  java home work\n completed: Not yet.", task1.toString());
        assertEquals("Title: dish washing\n completed: Done\n at: 2020-12-09", task2.toString());
        System.out.println(task1.toString());
        System.out.println(task2.toString());
    }

}