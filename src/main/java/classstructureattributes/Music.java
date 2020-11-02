package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, add your favourite author: ");
        Song song = new Song();
        song.setBand(scanner.nextLine());
        System.out.println("Please, add your favourita song: ");
        song.setTitle(scanner.nextLine());
        System.out.println("Please, add your favourite song's length in minutes: ");
        song.setLength(scanner.nextInt());
        scanner.nextLine();
        System.out.println(song.getBand() + " - " + song.getTitle() + "(" + song.getLength() + " perc)");
    }

}
