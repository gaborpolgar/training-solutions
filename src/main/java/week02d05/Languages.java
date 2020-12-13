package week02d05;

import java.util.ArrayList;
import java.util.List;

public class Languages {

    public static void main(String[] args) {
        List<String> progLanguages = new ArrayList<>();
        progLanguages.add("Java");
        progLanguages.add("Python");
        progLanguages.add("JavaScript");
        for (int i = 0; i < progLanguages.size(); i++) {
            if (progLanguages.get(i).length() > 5){
        System.out.println(progLanguages.get(i));
            }
        }

    }
}
