package iowritestring.school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Register {

    public static void main(String[] args) {
        Register reg = new Register();
        Path file = Path.of("src\\main\\resources\\tanulo_neve.txt");
        reg.average(file);
    }

    private String path = ".txt";

    public void newMark(String name, int mark){
    Path file = Path.of(name + path);
        try {
        if (!Files.exists(file)) {
        Files.writeString(file, Integer.toString(mark));
        }else {
            Files.writeString(file, mark + "\n", StandardOpenOption.APPEND);
        }
    } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }

public void average (Path file) {
        try {
            List<String> myFile = Files.readAllLines(file);
            double sum = 0;
            for (String s: myFile){
                sum += Double.parseDouble(s);
            }
            Files.writeString(file, "average: " + (sum/myFile.size()), StandardOpenOption.APPEND);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
}
}
