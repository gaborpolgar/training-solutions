package introcontrol;

public class IntroControl {

    public int subtractTenIfGreaterThanTen(int number){
        return (10 >= number) ? number : number-10;
    }

    public String describeNumber( int number) {
        if (number == 0) {
            return "zero";
        } else {
            return "not zero";
        }
    }

      public String greetingToJoe(String name){
        if (name.equals("Joe")){
            return "Hello Joe";
        } else{
            return "";
        }
    }

    public int calculateBonus(int sale){
        if( sale >= 1_000_000){
            return sale/10;
        } else{
            return 0;
        }
    }

    public int calculateConsumption (int prev, int next) {
        if (prev < 10_000) {
            return next - prev;
        } else {
            return prev - 10_000;
        }
    }

    public void printNumbers(int max) {
        if (max > 0) {
            for (int i = 0; i <= max; i++) {
                System.out.println(i);
            }
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b){
        if( a> b){
            for (int i = a;i > b; i--){
                System.out.println(i);
            }
        } else {
            for(int i = a; i<b; i++){
                System.out.println(i);
            }
        }
    }

    public void printOddNumbers(int max){
        for (int i = 0; i <= max; i++) {
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
}
