package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

    public static void main(String[] args) {
        Capsules tube = new Capsules();
        tube.addFirst("fehér");
        tube.addLast("zöld");
        tube.addFirst("piros");
        tube.addLast("fekete");
        tube.addFirst("lila");
        tube.removeFirst();
        tube.removeLast();
        System.out.println(tube.getColors());
    }

    private String color;
    private List<String> capsuleList = new ArrayList<>();

    public void addLast(String color){
        capsuleList.add(color);

    }

    public void addFirst(String color){
        capsuleList.add(0, color);

    }
    public void removeFirst(){
        capsuleList.remove(0);

    }

    public void removeLast(){
        capsuleList.remove(capsuleList.size()-1);

    }

    public List<String> getColors(){
        return capsuleList;
    }
}
