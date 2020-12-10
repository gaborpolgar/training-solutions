package controlselection.month;

import java.util.Locale;

public class DayInMonth {

    public int DaysInMonth(int year, String month) {
        switch (month.toLowerCase()) {
            case "Január", "Március", "Május", "Július", "Augusztus", "Október", "December":
                return 31;
            case "Február":
                if (year % 4 == 0 && (year % 100 != 0) || (year % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            case "Április", "Június", "Szeptember", "November":
                return 30;
            default:
                throw new IllegalArgumentException("Nem létezik ilyen hónap!");
        }
    }
}

