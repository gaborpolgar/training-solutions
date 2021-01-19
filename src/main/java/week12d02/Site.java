package week12d02;

public class Site {

    private OddorEven oddorEven;
    private Fence fence;
    private int length;

    public OddorEven getOddorEven() {
        return oddorEven;
    }

    public Fence getFence() {
        return fence;
    }

    public int getLength() {
        return length;
    }

    public Site(Fence fence, int evenOrOdd, int length, OddorEven oddorEven) {
        this.fence = fence;
        this.length = length;
        this.oddorEven = OddorEven.EVEN;
    }
}
