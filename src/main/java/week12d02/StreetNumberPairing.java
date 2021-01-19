package week12d02;

 enum OddorEven {

    EVEN (0), ODD(1);

    private final int number;

    OddorEven(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
