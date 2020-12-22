package week09d02;

public class FibCalculator {

    public long sumEvens(int bound) {
        int fibo1 = 0;
        int fibo2 = 1;
        long sum = 1;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (fibo1 + fibo2 == i) {
                fibo1 = fibo2;
                fibo2 = i;
                if (i > bound) {
                    break;
                }
                sum += i;
            }
        }
        return sum;
    }
}
