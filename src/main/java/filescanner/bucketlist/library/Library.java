package filescanner.bucketlist.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void loadFromFile() {
        try(Scanner scanner = new Scanner(Library.class.getResourceAsStream("/books.csv"))) {
            String delimiter = ";|(\r\n)";
            scanner.useDelimiter(delimiter);
        while(scanner.hasNextLine()){
            String regNum = scanner.nextLine();
            String author = scanner.nextLine();
            String title = scanner.nextLine();
            int yearOfPublish = scanner.nextInt();
            books.add(new Book (regNum, author, title, yearOfPublish));
        }
        }
            }
}
