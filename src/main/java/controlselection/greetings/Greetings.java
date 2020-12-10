package controlselection.greetings;

import test.Main;

public class Greetings {


    public static void main(String[] args) {
        System.out.println(appropriateWelcome(5, 0));
    }

    public static Welcomes appropriateWelcome(int hour, int minute) {
        if (hour < 5 || hour > 20 || hour == 20 && minute > 0 || (hour == 5 && minute ==0)) {
            return Welcomes.GOOD_NIGHT;
        }else if ((hour > 5) && hour < 9 || (hour == 5 && minute > 0)) {
                return Welcomes.GOOD_MORNING;
            } else if (hour > 9 && hour < 18 || hour == 18 && (minute > 0 || minute < 31) || (hour == 9 && minute== 0)){
                return Welcomes.GOOD_AFTERNOON;

            } else {
                return Welcomes.GOOD_EVENING;
        }
    }
}