package week06d05;

public class Biscuit {

    private int gramAmount;
    private BiscuitType type;

    public Biscuit(int gramAmount, BiscuitType type) {
        this.gramAmount = gramAmount;
        this.type = type;
    }

    public static Biscuit of(BiscuitType biscuit, int gramAmount){
        return new Biscuit(gramAmount, biscuit);
    }
}
