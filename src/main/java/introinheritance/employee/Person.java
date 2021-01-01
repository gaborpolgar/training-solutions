package introinheritance.employee;

public class Person {

    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void migrate (String newAdrress){
        this.address = newAdrress;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
