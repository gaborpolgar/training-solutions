package week12d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GradeRounderTest {

    @Test
    public void GradeRound(){
        GradeRounder rounder = new GradeRounder();
        int [] test = {81, 82, 85, 85, 85, 0};
        assertEquals(Arrays.toString(test), Arrays.toString(rounder.roundGrades(new int[]{81, 82, 83, 84, 85, 0})));
    }

}