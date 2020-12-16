package controliteration.dictionary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dictionary {

    public static void main(String[] args) {
        Dictionary dic = new Dictionary();
        dic.addItem("win", Arrays.asList("győzelem"));
        System.out.println(dic.dictionaryItems.get(0).getWord());
        System.out.println(dic.dictionaryItems.get(0).getTranslations().toString());
        System.out.println("______");
        System.out.println(dic.findTranslations("win").toString());
        System.out.println("----");
        System.out.println(dic.findTranslations("won").toString());
        System.out.println("---");
        dic.addItem("win", Arrays.asList("elvesztés"));
        System.out.println(dic.dictionaryItems.get(0).getTranslations().toString());
        List<String> newTrans = Arrays.asList("teszt");
        dic.dictionaryItems.get(0).addTranslations(newTrans);
        System.out.println(dic.dictionaryItems.get(0).getTranslations().toString());
        System.out.println("-");
        System.out.println(dic.findTranslations("win"));


    }

    private List<DictionaryItem> dictionaryItems = new ArrayList<>();

    public void addItem(String word, List<String> translations) {
        boolean found = false;
        for (DictionaryItem item: dictionaryItems) {
            if (item.getWord().equals(word)) {
                item.addTranslations(translations);
                found = true;
            }
        }

        if (!found) {
            dictionaryItems.add(new DictionaryItem(word, translations));
        }

    }

/*    public void addItem(String word, List<String> translations) {
        DictionaryItem newItem = new DictionaryItem(word, translations);
        if (!(dictionaryItems.isEmpty())){
        for (DictionaryItem item : dictionaryItems) {
            if (!(item.getWord() == word)) {
                dictionaryItems.add(newItem);
            }
        }
        } else {
                dictionaryItems.add(newItem);

        }
    }*/

    public List<String> findTranslations(String word) {
        for (DictionaryItem item : dictionaryItems) {
            if (item.getWord().equals(word)) {
                return item.getTranslations();
            }
        }
        return new ArrayList<>();
    }
}
