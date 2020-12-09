package enumtype.unit;

public enum LengthUnit {

    MM(1, true),
    CM(10, true),
    M(1000, true),
    YARD(9144, false),
    FOOT(3048, false),
    INCH(254, false);

private final boolean siUnit;
private final int inMillimeter;

    LengthUnit(int inMillimeter, boolean siUnit) {
        this.inMillimeter = inMillimeter;
        this.siUnit = siUnit;
    }

    public boolean isSiUnit() {
        return siUnit;
    }

    public int getInMillimeter() {
        return inMillimeter;
    }
}