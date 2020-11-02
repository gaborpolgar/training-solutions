package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter your name: ");
        client.setName(scanner.nextLine());
        System.out.println(client.getName());
        System.out.print("Please, enter your age: ");
        client.setYear(scanner.nextInt());
        scanner.nextLine();
        System.out.println(client.getYear());
        System.out.println("Please, add your address: ");
        client.setAddress(scanner.nextLine());
        System.out.println(client.getAddress());

    }
}
