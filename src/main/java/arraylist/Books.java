package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books {

    public static void main(String[] args) {
        Books book = new Books();
        book.bookStore.add("Galaxis utikalaúz stopposoknak");
        book.bookStore.add("Galaxis Viszlát, és kössz a halakat!");
        book.bookStore.add("Végjáték");
        System.out.println(book.toString());
        List <String> filteredBooks = book.findAllByPrefix("Galaxa");
        System.out.println(filteredBooks.toString());

    }

    private List<String> bookStore = new ArrayList<>();

    public void add (String book){
        bookStore.add(book);
    }

    public List<String> getBookStore() {
        return bookStore;
    }

    public List<String> findAllByPrefix(String prefix){
        List<String> foundedTitles = new ArrayList<>();
        cim: for (String book: bookStore) {
           for (int i = 0; i < prefix.length(); i++) {
            if (!(book.charAt(i) == prefix.charAt(i))){
                continue cim;
            }
        }
            foundedTitles.add(book);
        }
        return foundedTitles;
    }



}
