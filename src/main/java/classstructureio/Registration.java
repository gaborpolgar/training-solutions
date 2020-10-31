package classstructureio;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        System.out.println("Please, enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("enter your e-mail adress");
        String emailAdress = scanner.nextLine();
        System.out.println("Your registration detalis: ");
        System.out.println(name);
        System.out.println(emailAdress);
    }

}


