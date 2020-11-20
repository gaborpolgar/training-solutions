package stringtype.registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        new Registration().run();

    }
        public void run (){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, add your Username (Note: Username is neccesary): ");

            UserValidator uservalidator = new UserValidator();

            String username = scanner.nextLine();

            System.out.println("Please, add your unique password: (note the security reasons)");
            String password = scanner.nextLine();

            System.out.println("add your same password again: ");
            String password2 = scanner.nextLine();

            System.out.println("Please, add your email address: ");
            String email = scanner.nextLine();

            System.out.println(uservalidator.isValidUsername(username) ? "The username is OK." : "The username is invalid. ");
            System.out.println(uservalidator.isValidPassword(password, password2) ? "Your password accepted." : "The password is wrong.");
            System.out.println(uservalidator.isValidEmail(email) ? "Your email accepted." : "Your email is wrong");
        }
    }
