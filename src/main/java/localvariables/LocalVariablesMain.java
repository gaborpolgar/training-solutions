package localvariables;

import java.util.ArrayList;
import java.util.List;

public class LocalVariablesMain {

    public static void main(String[] args) {
        boolean b = false;
        System.out.println(b);
        int a = 2;
        int i = 3;
        int j = 4;
        int k = i;
        String s = "Hello World";
        String t = s;
    }

    public void testMethod() {
        int x = 0;
    }
}
