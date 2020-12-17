package introexception;

public class SsnValidator {

    public static void main(String[] args) {
        System.out.println(isValidSsn("123456788"));
    }

    public static boolean isValidSsn(String ssn){
        if (ssn.length() != 9){
            return false;
        }
        try {
            Integer.parseInt(ssn);
        } catch(NumberFormatException n){
            System.out.println("A megadott láncban nem csak számok vannak.");
            return false;

        }
        int sum= 0;
        try {
            for (int i = 0; i < ssn.length() - 1; i++) {
                if (i % 2 == 0 || i == 0) {
                    sum += Integer.parseInt(String.valueOf(ssn.charAt(i))) * 3;
                } else {
                    sum += Integer.parseInt(String.valueOf(ssn.charAt(i))) * 7;
                }
            }
        } catch (IllegalArgumentException iae){
            return false;
        };
        System.out.println(sum);
        return sum%10 == Integer.parseInt(String.valueOf(ssn.charAt(8)));
    }
}
