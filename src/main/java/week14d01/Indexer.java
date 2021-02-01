package week14d01;

import java.util.*;

public class Indexer {


    public static void main(String[] args) {
    List<String> names = List.of("Abraham", "Lujza", "Magdolna", "Odon", "Agoston");
        Indexer index = new Indexer();
        System.out.println(index.index(names));
    }

    public Map<Character, List<String>> index(List<String> names){
        Map<Character, List<String>> pairingNames = new HashMap<>();
        for (String name: names) {

        if (pairingNames.containsKey(name.charAt(0))){
            pairingNames.get(name.charAt(0)).add(name);
        } else {
            pairingNames.put(name.charAt(0), new ArrayList<String>(Collections.singleton(name)));
        }
        }
        return pairingNames;
    }
}
