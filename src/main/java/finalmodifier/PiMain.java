package finalmodifier;

public class PiMain {

    public static void main(String[] args) {

        CircleCalculator calculator = new CircleCalculator();
        System.out.println(calculator.calculateArea(2.0));
        System.out.println(calculator.calculatePerimeter(2));

        CylinderCalculator calculatorTwo = new CylinderCalculator();
        System.out.println(calculatorTwo.calculateSurfaceArea(2.0, 2.0));
        System.out.println(calculatorTwo.calculateVolume(2.0, 2.0));

    }
}
