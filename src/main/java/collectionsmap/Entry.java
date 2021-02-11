package collectionsmap;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Entry {

    private String IPaddress;
    private LocalDate date;
    private String login;

    public Entry(String IPaddress, LocalDate date, String login) {
        this.IPaddress = IPaddress;
        this.date = date;
        this.login = login;
    }

    public String getIPaddress() {
        return IPaddress;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "IPaddress='" + IPaddress + '\'' +
                ", date=" + date +
                ", login='" + login + '\'' +
                '}';
    }
}
