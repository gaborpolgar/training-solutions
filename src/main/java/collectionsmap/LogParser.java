package collectionsmap;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogParser {

    public Map<String, List<Entry>> parseLog(String log){
        Map<String, List<Entry>> logs = new HashMap<>();
        String [] parts = log.split(" ");
        String ip = parts[0];
        String [] dates = parts[1].split(".");
        LocalDate date;
        try {
        date = LocalDate.of(Integer.parseInt(dates[0]), Integer.parseInt(dates[1]), Integer.parseInt(dates[2]));
    } catch ( IllegalArgumentException iae){
            throw new IllegalArgumentException("The log does not contains date parts");
        }
        // logs.put(log, new ArrayList<>(new Entry(ip, date, parts[2]));
        return logs;
}
}
