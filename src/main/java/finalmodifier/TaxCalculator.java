package finalmodifier;

public class TaxCalculator {

    public final int HUNGARIAN_TAX = 27;

    public double tax( double price){
        return price*0.27;
    }

    public double priceWithTax(double price){
        return price + tax(price);
    }
}
