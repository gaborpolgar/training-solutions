package math;

import java.util.Random;

public class Warrior {

    private String name;
    private Point position;
    private int stamina;
    private double skill;

    private final Random rnd = new Random();
    public Warrior(String name, Point position) {
        this.name = name;
        this.position = position;
        stamina = rnd.nextInt(81) + 20;
        skill = rnd.nextDouble();
    }

    public Point getPosition(){
    return position;
    }

    public void move (Warrior warrior){
        int newX = position.getX();
        int newY = position.getY();
        if (warrior.getPosition().getX() - position.getX() > 0) {
            newX++;
        }else if (warrior.getPosition().getX() - position.getX() < 0){
            newX--;
        }
        if (warrior.getPosition().getY() - position.getY() > 0) {
            newY++;
        }else if (warrior.getPosition().getY() - position.getY() < 0){
            newY--;
        }
        position = new Point(newX, newY);

    }

    public void attack (Warrior warrior){
        if (rnd.nextDouble() < skill){
            warrior.stamina -= rnd.nextInt(3) +1;
        }
    }

    public double distance (Warrior other){
        return position.distance(other.position);
    }

    public boolean isAlive(){
        return stamina > 0;
    }

    public String toString(){
        return (name + ": (" + position.getX() + ":" + position.getY() + ") " + stamina);
    }


}
