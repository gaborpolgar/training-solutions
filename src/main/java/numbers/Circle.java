package numbers;

public class Circle {

    private int diameter;
    public final static double PI = Math.round(Math.PI * 100)/100.0;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    public double perimeter (){
        return 2*diameter*PI;
}

    public double area(){
        return Math.pow(diameter, 2)*PI;
    }

}
