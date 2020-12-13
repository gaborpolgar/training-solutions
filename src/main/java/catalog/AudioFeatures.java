package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {

    private List<String> composer = new ArrayList<>();
    private String title;
    private int length;
    private List<String> performers;

    AudioFeatures (String title, int length, List<String> performers){
    this.title = title;
    this.length = length;
    this.performers = performers;
        if (Validators.isBlank(title)){
            throw new IllegalArgumentException();
        }
        if (length <= 0){
            throw new IllegalArgumentException();
        }
        if (Validators.isEmpty(performers)){
            throw new IllegalArgumentException();
        }
    }
    AudioFeatures (String title, int length, List<String> composer, List<String> performers){
    this.title = title;
    this.length = length;
    this.performers = performers;
    this.composer = composer;
    }

    @Override
    public List<String> getContributors() {
       List<String> ListOfCompAndPerform = new ArrayList<>();
        for (String performer: performers) {
            ListOfCompAndPerform.add(performer);
        }
        for (String composer: composer){
            ListOfCompAndPerform.add(composer);
        }
        return ListOfCompAndPerform;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
}
