package week08d03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringLists {

    private List<String> union = new ArrayList<>();

    @Override
    public String toString() {
        return "StringLists{" +
                "union=" + union +
                '}';
    }

    public static void main(String[] args) {
        StringLists list = new StringLists();
        List<String> first = Arrays.asList("alma", "körte", "banán");
        List<String> second = Arrays.asList("alma", "szőlő", "banán");
        List<String> union = new ArrayList<>(list.stringListsUnion(first, second));
        System.out.println(union);

    }

    public List<String> stringListsUnion(List<String> first, List<String> second){
        List<String> union = new ArrayList<>();
        for (int i = 0; i < first.size(); i++) {
             for (int j = 0; j < second.size(); j++) {
            if (!(union.contains(first.get(i)))){
                union.add(first.get(i));
            }
            }
        }  for (int i = 0; i < second.size(); i++) {
             for (int j = 0; j < first.size(); j++) {
            if (!(union.contains(second.get(i)))){
                union.add(second.get(i));
            }
            }
        }

        return union;
    }
}
