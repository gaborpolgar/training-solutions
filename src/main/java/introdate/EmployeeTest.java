package introdate;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee = new Employee (1985, 05, 05, "Polgár Gábor");
        System.out.println(" Your employee's name: " + employee.getName());
        System.out.println("Employee's date of Birth: " + employee.getDataOfBirth());
        System.out.println("The employment's starting date: " + employee.getBeginEmployment());
    }
}
