package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Douglas Adams", "Galaxis utikalauz stopposoknak");
        book.register("14578");
        System.out.println(book.getRegNumber());
    }

}
