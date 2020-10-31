package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Please, give me two whole number to add.");
        System.out.println("The first integer: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumb = scanner.nextInt();
        scanner.nextLine();
        System.out.println("The second integer: ");
        int secondNumb = scanner.nextInt();
        System.out.print(firstNumb+ " + ");
        System.out.println(secondNumb);
        System.out.println(firstNumb + secondNumb);
    }
}
