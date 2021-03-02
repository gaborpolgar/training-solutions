package covid;

import java.util.Scanner;

public class Covid {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            UserInputManager userInputManager = new UserInputManager(scanner);
        }
    }
}
