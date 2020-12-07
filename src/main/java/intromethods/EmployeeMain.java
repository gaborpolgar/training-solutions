package intromethods;

public class EmployeeMain {
    public static void main(String[] args) {
    Employee worker = new Employee("Polgár Gábor", 2022, 300_000 );
    worker.setName("Polgár Ákos");

        System.out.println(worker.toString());
    }
}
