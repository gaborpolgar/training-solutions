package week11d01;

public class DivisonFinder {

    public int findDivisors(int n){
        String number = Integer.toString(n);
            String [] arr = number.split("");
            int [] numbers = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
        }
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (n % numbers[i] == 0){
                counter++;
            }
        }
        return counter;
    }
}
