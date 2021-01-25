package iowriter.music;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BandManager {

    private List<Band> bands = new ArrayList<>();

    public void printBands (Path fileToWrite, int year) {
        try (BufferedWriter writer = new BufferedWriter(Files.newBufferedWriter(fileToWrite))) {
            for (Band band : bands) {
                if (band.getYear() < year) {
                    writer.write(band.getName() + "\n");
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("The file does not exist", ioe);
        }
    }

    private List<Band> getOlderBands (Path file) {
        try (BufferedReader reader = new BufferedReader(Files.newBufferedReader(file))){
            String line;
            while ((line = reader.readLine()) != null){
                String [] subs = line.split(";");
                Band band = new Band(subs[0], Integer.parseInt(subs[1]));
                bands.add(band);
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Can't read file.", ioe);
        }
        return bands;
    }

}
