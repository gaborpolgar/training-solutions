package week13d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    public void testTeachers(){
        School sch = new School();
        assertEquals(24, sch.findClassPerWeekByTeacher("Hal Hajnal"));
    }

}