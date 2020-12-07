package week07d01;

public class MathAlgorithms {

    public static void main(String[] args) {
        System.out.println(MathAlgorithms.isPrime(4));
    }

    public static boolean isPrime(int x) throws IllegalArgumentException {
        if (x < 0) {
            throw new IllegalArgumentException("Az ön által megadott szám nem pozitív egész.");
        }
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
            return true;
    }
}
