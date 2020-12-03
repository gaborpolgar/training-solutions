package debug;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {

    public static void main(String[] args) {
        Employee pg = new Employee("Polgár Gábor", 1985);
        Employee to = new Employee("Takács Orsolya", 1990);
        List<Employee> emp = new ArrayList<>();
        Company familyEnterprise = new Company(emp);
        familyEnterprise.addEmployee(pg);
        familyEnterprise.addEmployee(to);
        System.out.println(familyEnterprise.listEmployeeNames());
        System.out.println(familyEnterprise.findEmployeeByName("Polgár Gábor").getName());



    }
}
