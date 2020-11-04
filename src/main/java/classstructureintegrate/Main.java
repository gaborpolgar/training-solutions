package classstructureintegrate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Kérem adja meg a számla nevét: ");
        Scanner scanner = new Scanner(System.in);
        String accountName = scanner.nextLine();
        System.out.print("Kérem adja meg a számlájának az összegét: ");
        int myBalance = scanner.nextInt();
        scanner.nextLine();
        System.out.println(accountName);
        System.out.println(myBalance);
        Product myAccount;
        myAccount = new Product(accountName, myBalance);
        System.out.println(myAccount.getName());
        System.out.println(myAccount.getName() + myAccount.getPrice());
        myAccount.decreasePrice(100_000);
        System.out.println(myAccount.getName() + myAccount.getPrice());
        myAccount.increasePrice(300_000);
        System.out.println(myAccount.getName() + myAccount.getPrice());

    }
}
