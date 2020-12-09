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


    }
}
