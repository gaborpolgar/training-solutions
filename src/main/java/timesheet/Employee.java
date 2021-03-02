package timesheet;

public class Employee {

    private String firstname;
    private String lastname;
    private String name;

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getName() {
        return firstname + " " + lastname;
    }
}
