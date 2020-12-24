package filescanner.bucketlist.library;

public class Book {

    private String regNum;
    private String author;
    private String title;
    private int yarOfPublish;

    public Book(String regNum, String author, String title, int yarOfPublish) {
        this.regNum = regNum;
        this.author = author;
        this.title = title;
        this.yarOfPublish = yarOfPublish;
    }

    public String getRegNum() {
        return regNum;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYarOfPublish() {
        return yarOfPublish;
    }
}
