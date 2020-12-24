package filescanner.bucketlist;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class BucketList {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Path.of("books.csv"))) {
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
