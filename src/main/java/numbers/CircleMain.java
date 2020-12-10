package numbers;

public class CircleMain {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.perimeter());
        System.out.println(circle.area());
        System.out.println(Circle.PI);
    }
}
