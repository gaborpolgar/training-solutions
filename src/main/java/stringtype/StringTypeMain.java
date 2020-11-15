package stringtype;

public class StringTypeMain {

    public static void main(String[] args) {

        String prefix = "Hello ";
        String name = "Jon Doe";
        String message = prefix + name;
        message = message + 444;
        System.out.println(message);
        boolean b = (message == "Hello John Doe");
        boolean c = message == "Hello John Doe444";
        System.out.println(c);
        c = message.equals("Hello John Doe444");
        System.out.println(b + " " + c);
        String emptyStrings = "" + "";
        System.out.println(emptyStrings.length());
        String abcde = "Abcde";
        System.out.println(abcde.length());
        System.out.println(abcde.charAt(0) +"," + abcde.charAt(2));

    }
}
