package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {
        System.out.println("Please, add a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Your number is divisible by three: ");
        System.out.print((number%3 ==0));
    }
}
