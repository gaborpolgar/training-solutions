package covid;

public class Menu {

    private UserInputManager userInputManager;

    public Menu(UserInputManager userInputManager) {
        this.userInputManager = userInputManager;
    }

    public void print(){
        System.out.println("VACCINATION PROGRAM");
        System.out.println("1. REGISTRATION");
        System.out.println("2. MASS REGISTRATION");
        System.out.println("3. GENERATION");
        System.out.println("4. VACCINATION");
        System.out.println("5. CANCELED VACCINATION");
        System.out.println("6. REPORT");
        System.out.println("7. EXIT");
    }

    public int choose (){
        do{
            int choice = userInputManager.getNumber(Messages.getUserInputMessage());
            if (choice >= 1 && choice <= 7 ) {
                return choice;
            } else{
                System.out.println(Messages.getErrorMenuMessage());
            }
        } while (true);
    }


}
