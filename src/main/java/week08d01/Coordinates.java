package week08d01;

public class Coordinates {

    private int x;
    private int y;

    public void setX(int x) {
        this.x += x;
    }

    public void setY(int y) {
        this.y += y;
    }

    @Override
    public String toString() {
        return getX() + ":" + getY();
    }

    public Coordinates() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
