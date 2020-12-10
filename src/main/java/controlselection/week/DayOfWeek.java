package controlselection.week;

public class DayOfWeek {

    public String dayOfWeeks(String day){
        switch(day){
            case "hétfő":
                return "hét eleje";
            case "kedd":
            case "szerda":
            case "csütörtök":
                return "hét közepe";
            case "péntek":
                return "majdnem hétvége";
            case "szombat":
            case "vasárnap":
                return "hét vége";
            default:
                throw new IllegalArgumentException("Nem valós nap: " + day);
        }
    }
}
