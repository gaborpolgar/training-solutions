package math;

import java.util.Random;

public class RoundingAnomaly {

    public static void main(String[] args) {
        RoundingAnomaly round = new RoundingAnomaly();
        int count = 100;
        double sum = 0;
        for (int i = 0; i < count; i++) {
            double diff = round.difference(1000, 1_000_000, 5);
        }
        ;
    }

    public double[] randomNumbers(int size, double max, int scale){
        double [] floatNumbers = new double[size];
        Random rnd = new Random();
        double factor = Math.pow(10, scale);
        for (int i = 0; i < size; i++) {
            floatNumbers[i] = Math.round(rnd.nextDouble()* max * factor) / factor;
        }
        return floatNumbers;
    }

    public double roundAfterSum(double[] numbers){
        double result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return Math.round(result);
    }

    public double sumAfterRound(double[] numbers){
        double result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += Math.round(numbers[i]);
        }
        return result;
    }

    public double difference (int size, double max, int scale){
        double [] array = randomNumbers(size, max, scale);
        return Math.abs(roundAfterSum(array) - sumAfterRound(array));
    }


}
