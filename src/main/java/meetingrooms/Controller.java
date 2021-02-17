package meetingrooms;

import java.util.Scanner;

public class Controller {


    private Office office;

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.readOffice();
        controller.printMenu();
        controller.runMenu();
    }

        public void readOffice(){
            Office office = new Office();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, give me amount of office: ");
            int numberOfMeetingRooms = scanner.nextInt();
            System.out.println(numberOfMeetingRooms);


            for (int i = 0; i<numberOfMeetingRooms; i++){
                System.out.println("Please, add the Rooom name: ");
                String name = scanner.nextLine();
                System.out.println("Please, add the room's length: ");
                int length = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Please, add the room's width: ");
    int width = scanner.nextInt();
                scanner.nextLine();
                MeetingRoom meetingRoom = new MeetingRoom(name, length, width);
                office.addMeetingRoom(meetingRoom);
            }

        }

        public void printMenu(){
            System.out.println("1. Tárgyalók sorrendben /n"
        + "2. Tárgyalók visszafele sorrendben /n" +
                    "3. Minden második tárgyaló /n" +
                    "4. Területek /n" +
                    "Keresés pontos név alapján /n" +
                    "Keresés névtöredék alapján /n" +
                    "Keresés terület alapján /n");
        }

        public void runMenu(){
        Scanner scanner = new Scanner(System.in);
            System.out.println();

        }

    }
