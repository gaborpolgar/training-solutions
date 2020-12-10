package controlselection.greetings;

public enum Welcomes {

    GOOD_MORNING ("Jó reggelt!"),
    GOOD_NIGHT ("jó éjszakát!"),
    GOOD_AFTERNOON ("jó napot!"),
    GOOD_EVENING(" Jó estét!");

 static String s;

    Welcomes(String s) {
    }

    public String getWelcome() {
        return s;
    }
}


