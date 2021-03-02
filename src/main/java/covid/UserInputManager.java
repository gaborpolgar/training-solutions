package covid;

import java.util.Scanner;

public class UserInputManager {

private Scanner scanner;

    public UserInputManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getNumber(String message) {
        System.out.println(message);
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public String getString(String message){
        System.out.println(message);
        String data = scanner.nextLine();
        return data;
    }
}
