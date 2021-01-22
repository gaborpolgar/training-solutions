package idread;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class IdManager {

    public void readIdsFromFile(File file) {
        List<String> ids = new ArrayList<>();

        try {
            String line;
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                ids.add(reader.readLine());
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
}
