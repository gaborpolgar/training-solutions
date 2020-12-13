package week02d02;

public class Phone {

    public static void main(String[] args) {
        Phone phone = new Phone("xiaomi", 16);
        phone.getType();
        phone.getMem();
    }

    private String type;
    private int mem;

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
    }

    public int getMem() {
        return mem;
    }
}
