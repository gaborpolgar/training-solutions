package week12d01;

import java.util.Arrays;

public class GradeRounder {


    public int [] roundGrades (int [] grades){
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 40){
                if ( grades[i] % 5 == 0 || grades[i] % 5 >= 3){
                    if (grades[i] % 5 == 3) {
                        grades[i] = grades[i] + 2;
                    }
                    if (grades[i] % 5 == 4){
                        grades[i]  = grades[i] + 1;
                        }
                    }
                }
            }
        return grades;
    }
}
