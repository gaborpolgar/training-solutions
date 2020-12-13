package week03d04;

public class PhoneParser {

    public static void main(String[] args) {
        System.out.println(parse("10-1234567"));

    }

    public static Phone parse(String phoneNumber){
        String numb [] = phoneNumber.split("-");
        return new Phone(numb[0], numb[1]);
    }
}
