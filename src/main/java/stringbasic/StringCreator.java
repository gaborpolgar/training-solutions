package stringbasic;

public class StringCreator {

    public String createStringForHeap() {
        return "heap";
    }

    public String createStringForPool() {
        return new String("pool");
    }
}
