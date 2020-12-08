package week07d02;

public class DigitSum {

    public static void main(String[] args) {
        System.out.println(DigitSum.sumOfDigits(11));
    }

    public static int sumOfDigits(int x){
        String digits = Integer.toString(x);
        System.out.println(digits);
        int sum = 0;
        for (int i = 0; i < digits.length(); i++) {
            sum += (Character.getNumericValue(digits.charAt(i)));
        }
        return sum;
    }
}
