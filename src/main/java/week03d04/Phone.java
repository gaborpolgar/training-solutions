package week03d04;

public class Phone {

    private String prefix;

    @Override
    public String toString() {
        return "Phone{" +
                "prefix='" + prefix + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    private String number;

    public Phone(String prefix, String number) {
        this.prefix = prefix;
        this.number = number;
    }

}
