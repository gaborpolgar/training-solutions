package catalog;

public class SearchCriteria {

    private String contributor;
    private String title;

    SearchCriteria (String contributor, String title){
    this.contributor = contributor;
    this.title = title;
    }
    public static SearchCriteria createByBoth (String title, String contributor){
        if (title == null || contributor == null){
            throw new IllegalArgumentException();
        }
        return new SearchCriteria(contributor, title);
    }

    public static SearchCriteria createByContributor( String contributor){
        if (contributor == null){
            throw new IllegalArgumentException();
        }
        return new SearchCriteria(contributor, null);
    }

    public static SearchCriteria createByTitle(String title){
        if (title == null){
            throw new IllegalArgumentException();
        }
        return new SearchCriteria(null, title);
    }

    public boolean hasContributor () {
        //return contributor != null;
        return !(Validators.isBlank(contributor));
    }

    public boolean hasTitle(){
        return !(Validators.isBlank(title));
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }
}
