package controliteration.dictionary;

import java.util.List;

public class DictionaryItem {

    private String word;
    private List<String> translations;

    public DictionaryItem(String word, List<String> translations) {
        this.word = word;
        this.translations = translations;
    }
    public void DictionaryItem (String word, List<String> translations){

    }

    public void addTranslations(List<String> translations){

    }


    public String getWord() {
        return word;
    }

    public List<String> getTranslations() {
        return translations;
    }
}
