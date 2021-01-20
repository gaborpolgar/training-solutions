package ioreadwritebytes.temperatures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesReader {

    public Temperatures readTemperatures(String pathString) {
        Path file = Path.of(pathString);
        Temperatures temperatures;
        try {
            byte[] bytes = Files.readAllBytes(file);
        temperatures = new Temperatures(bytes);
        } catch (IOException ioe){
            throw new IllegalStateException("The file cannot found", ioe);
        }

return temperatures;
    }
}
