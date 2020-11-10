package statements;

public class TimeMain {

    public static void main(String[] args) {
        Time morning = new Time(7, 30, 00);
        System.out.println(morning.toString());
        System.out.println(morning.getInMinutes());
        System.out.println(morning.getInSeconds());
        Time lunch = new Time (12, 00,30);
        System.out.println(morning.earlierThan(lunch));

    }
}
