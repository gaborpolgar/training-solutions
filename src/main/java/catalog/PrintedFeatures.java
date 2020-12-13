package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature{

    private List<String> authors;
    private int numberOfPages;
    private String title;

    PrintedFeatures(String title, int numberOfPages, List<String> authors){
        if (Validators.isBlank(title)){
            IllegalArgumentException actualException= new IllegalArgumentException("Empty title");
            throw actualException;
        }
        if (numberOfPages <= 0){
            throw new IllegalArgumentException();
        }
        if (Validators.isEmpty(authors)){
            throw new IllegalArgumentException();
        }
    this.title = title;
    this.numberOfPages = numberOfPages;
    this.authors = authors;
    }

    @Override
    public List<String> getContributors(){
        return new ArrayList<>(authors);
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
