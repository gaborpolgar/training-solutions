package attributes.person;

public class PersonMain {

    public static void main(String[] args) {
        Address adr = new Address("Hungary", "Budapest", "Kassai", "1142");
        Person pers = new Person("Polgár Gábor", "SZIG");
        pers.moveTo(adr);
        System.out.println(pers.personToString());
        System.out.println(pers.getAdr().addressToString());

    }
}
