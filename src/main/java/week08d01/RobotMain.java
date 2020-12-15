package week08d01;

public class RobotMain {

    public static void main(String[] args) {
        Robot robo = new Robot();
        System.out.println(robo.toString());
        robo.move("FFLJB");
        System.out.println(robo.toString());
    }
}
