package attributes.person;

public class Person {

    private String name;
    private String indentificationCard;
    private Address adr;

    public String personToString(){
        return name + " " + indentificationCard;
    }

    public Person(String name, String indentificationCard) {
        this.name = name;
        this.indentificationCard = indentificationCard;
    }

    public Person() {
    }

    public void correctData(String name, String indentificationCard) {
        this.name = name;
        this.indentificationCard = indentificationCard;
    }

    public Address getAdr() {
        return adr;
    }

    public void moveTo(Address address){
        this.adr = address;
    }
}
