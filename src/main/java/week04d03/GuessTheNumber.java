package week04d03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Random random = new Random();
        int randNumb = random.nextInt(100) +1;
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Please, add numbers: ");
            for (;;){
            int guess = scanner.nextInt();
            scanner.nextLine();
            if (guess == randNumb){
                System.out.println("The number is equal with the random number.");
            } else if (guess > randNumb){
                System.out.println("Your digit larger, than the random number.");
            } else{
                System.out.println("Your digit smaller, than the random number.");
            }
            }
        }
    }
}
