package numbers;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println(("6-(3*2)+3)/3.0"));
            double result = (6-(3*2)+1)/3.0;
            System.out.println(result);
            System.out.println("Give me the result!");
            double tip = scanner.nextDouble();
            scanner.nextLine();
            System.out.println(tip);
            System.out.println(result  - tip);
            if (Math.abs(result  - tip)<=0.0001){
                System.out.println("A megoldás helyes!");
            } else {
                System.out.println("A megoldás helytelen!");
            }


        }
    }
}
