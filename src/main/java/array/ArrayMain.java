package array;


public class ArrayMain {

    public static void main(String[] args) {
    String [] days ={"Monday", "Thusday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(days[1]);
        System.out.println(days.length);
        int [] twoPwr = new int[5];
        for (int i = 0; i < twoPwr.length; i++) {
            twoPwr[i] =(int) Math.pow(2, i);
        }
        for (int i = 0; i < twoPwr.length; i++) {
            System.out.println(twoPwr[i]);
        }

        boolean [] booleans = new boolean[6];
        for (int i = 0; i < booleans.length; i++) {
            if (i == 0) {
                booleans[0] = false;
            } else if (i % 2 == 0) {
                booleans[i] = false;
            } else{
                booleans[i] = true;
            }
        }
            for (int j = 0; j < booleans.length; j++) {
                System.out.println(booleans[j]);
            }
        }






    }

