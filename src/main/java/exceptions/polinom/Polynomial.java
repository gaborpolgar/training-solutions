package exceptions.polinom;

public class Polynomial {

    private double [] factors;
    private double x;
    private String [] sFactors;

    public Polynomial(double[] coefficients) {
        if (coefficients == null) {
            throw new NullPointerException("factors is null");
        }
        this.factors = coefficients;
    }

    public Polynomial(String[] sFactors) {
        if (sFactors == null)
            throw new NullPointerException("sFactors is null");
        try {
            this.factors = convertSFactors(sFactors);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Illegal factors, not a number", ex);
        }
    }

    public double evaluate(double x) {
        int n = factors.length - 1;
        double sum = 0;
        for (int j = n; j >= 0; j--) {
            sum += factors[j] * Math.pow(x,(double)n - j);
        }
        return sum;
    }

    public double[] getFactors() {
        return factors;
    }

    private double[] convertSFactors(String[] sFactors) {
        double[] factors = new double[sFactors.length];
        for (int j = 0; j < sFactors.length; j++) {
            factors[j] = Double.parseDouble(sFactors[j]);
        }
        return factors;
    }

}