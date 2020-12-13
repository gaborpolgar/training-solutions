package week03d02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Position {

    public static void main(String[] args) {
        List<Position> positions = Arrays.asList(new Position("Polgár Gábor", 250_000), new Position("Kohajda Tamás", 140_000));
        for (Position position: positions) {
            if (position.getBonus() > 150_000){
                System.out.println(position.toString());
            }
        }
    }

    @Override
    public String toString() {
        return "Position{" +
                "name='" + name + '\'' +
                ", bonus=" + bonus +
                '}';
    }

    private String name;

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    private int bonus;

}
