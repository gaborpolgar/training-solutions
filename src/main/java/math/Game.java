package math;

public class Game {

    public static void main(String[] args) {
        Warrior soccerer = new Warrior("Bűbáj", new Point(2, 1));
        Warrior viking = new Warrior("Lothbrook", new Point(3,2));

        for(int round = 1; soccerer.isAlive() && viking.isAlive(); round++){
            System.out.println("Round " + round);
            System.out.println(soccerer);
            System.out.println(viking);
            if(soccerer.distance(viking) >0){
                soccerer.move(viking);
                viking.move(soccerer);
            } else {
                soccerer.attack(viking);
                if (viking.isAlive()){
                    viking.attack(soccerer);
                }
            }
        }
        System.out.println("the survivor: " + (soccerer.isAlive() ? soccerer : viking));
    }
}
