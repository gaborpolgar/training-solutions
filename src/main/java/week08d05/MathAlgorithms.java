package week08d05;

public class MathAlgorithms {

    public static void main(String[] args) {
        System.out.println(greatestCommonDivisor(30, 75));
    }

    public static int greatestCommonDivisor(int numb1, int numb2) {
        for (int i = numb1 - 1; i > 0; i--) {
            if (numb1 % i == 0) {
                if (numb2 % i == 0) {
                    return i;
                }
            }
        }
        return -1;
    }
}
