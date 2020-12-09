package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {

        Person wife;
        Person son;

        Person husband = new Person("Polgár Gábor", 1985);
        wife = husband;
        son = wife;

        son.setName("Borsos Zoltan");

        System.out.println(son.getName());
        System.out.println(wife.getName());
        System.out.println(husband.getName());

        Person newPerson = new Person("Tamás Béla", 1990);

        int i = 24;
        int j = i;
        j++;
        System.out.println(i + " " + j);

        wife = newPerson;
        System.out.println(wife.getName());

    }
}
