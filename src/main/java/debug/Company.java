package debug;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Employee> employees;

    public Company(List<Employee> employees){
    this.employees = employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public Employee findEmployeeByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
    } return null;
        }

    public List<String> listEmployeeNames(){
        List<String> employeeNames = new ArrayList<>();
        for (Employee employee: employees) {
            employeeNames.add(employee.getName());
        }
        return employeeNames;
    }
}
