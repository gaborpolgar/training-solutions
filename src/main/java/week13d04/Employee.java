package week13d04;

public class Employee {

    private String name;
    private String birthOfYear;

    public Employee(String name, String birthOfYear) {
        this.name = name;
        this.birthOfYear = birthOfYear;
    }


    @Override
    public String toString() {
        return "Az alkalmazott neve: " + name + ", születési éve: " + birthOfYear;
    }

    public String getName() {
        return name;
    }

    public String getBirthOfYear() {
        return birthOfYear;
    }
}
