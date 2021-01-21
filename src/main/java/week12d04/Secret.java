package week12d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Secret {

    public static void main(String[] args) {
        encoding();
    }

    public static void encoding() {
        Path file = Path.of("secret.dat");
        try {
            byte[] bytes = Files.readAllBytes(file);
            //System.out.println(Arrays.toString(bytes));
            int a = 0;
            char[] chars = new char[bytes.length];
            byte plusTen = 10;
            int counter = 0;
            for (byte by : bytes) {
                a = (by + plusTen);
                //System.out.println(a);
                chars[counter] = (char) a;
                counter++;
            }
            System.out.print(Arrays.toString(chars));
        } catch (IOException ioe) {
           new IllegalStateException("The file do not exist.", ioe);
        }

        }

    }
