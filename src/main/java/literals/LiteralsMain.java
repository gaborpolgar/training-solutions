package literals;

public class LiteralsMain {

    public static void main(String[] args) {

        String t = "" + 1 + 2;
        String s2 = Integer.toString(1) + Integer.toString(2);
        double quotient = 3 / 4;
        System.out.println(quotient);
        quotient = 3/4.0;
        System.out.println(quotient);
        quotient = 3/4L;
        // long big = 3_244_444_444;
        String s = "árvíztűrőtükörfúrógép";
        String word = "TITLE";
        word.toUpperCase();
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));




    }
}
