package week08d01;

public class Robot {

    private Coordinates coordinates;

    public Robot() {
        this.coordinates = new Coordinates();
    }

    public Coordinates move (String moves){
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'F'){
                    coordinates.setY(1);
            } else if (moves.charAt(i) == 'J'){
                coordinates.setX(1);
            } else if (moves.charAt(i) == 'L'){
                coordinates.setY(-1);
            } else if (moves.charAt(i) == 'B'){
                coordinates.setX(-1);
            } else {
                throw new IllegalArgumentException("Nem megfelelő mozgásutasítást adott meg!");
            }
        }
        return coordinates;
    }

    public Coordinates getCoordinates() {
        return coordinates ;
    }

    @Override
    public String toString() {
        return "Robo pozíciója: "  + getCoordinates();
    }
}
