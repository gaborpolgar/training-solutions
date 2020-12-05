package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {
        Book book = new Book();
        //System.out.println(book); variable not initalized
        System.out.println(book);
        Book emptyBook;
        // System.out.println(emptyBook);
        emptyBook = null;
        System.out.println(emptyBook);
        System.out.println(emptyBook == null);
        Book anotherBook = new Book();
        anotherBook = new Book();
        System.out.println(anotherBook instanceof Book);

        List<Book> library = Arrays.asList(book, emptyBook, anotherBook);
        Book [] regal = {book, emptyBook, anotherBook};
        List<Book> store = new ArrayList<>();
        store.add(book);
        store.add(anotherBook);
        store.add(emptyBook);


    }


}
