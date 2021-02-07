package collectionsequalshash;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookCatalog {

    public Book findBookByTitleAuthor(List<Book> books, String title, String author){
        Book wantedBook = new Book(title, author);
        if (!books.contains(wantedBook)){
            return null;
        }
        int index = books.indexOf(wantedBook);
                    return books.get(index);
}

    public Book findBook(List<Book> books, Book book){
        if (!books.contains(book)){
            return null;
        }
            return books.get(books.indexOf(book));
    }

    public Set<Book> addBooksToSet(Book [] books){
        Set<Book> newBooks = new HashSet<>();
        for (Book book: books) {
        newBooks.add(book);
        }
        return newBooks;
    }
}
