package methodstructure.bmi;

public class BodyMass {

    private double weight;
    private double height;
    private BmiCategory bmiIndex;
    private static double LOWER_LIMIT = 18.5;
    private static double UPPER_LIMIT = 25.0;


    public BodyMass(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double bodyMassIndex(){
        return weight/Math.pow(height,2);
    }

    public BmiCategory body(){
        double index = bodyMassIndex();
        if (index < LOWER_LIMIT){
            bmiIndex = BmiCategory.UNDERWEIGHT;
        } else if (bodyMassIndex() > UPPER_LIMIT){
            bmiIndex = BmiCategory.OVERWEIGHT;
        } else{
            bmiIndex = BmiCategory.NORMAL;
        }
        return bmiIndex;
    }

    boolean isThinnerThan(BodyMass bm){
        return bodyMassIndex() < bm.bodyMassIndex();
    }

}
