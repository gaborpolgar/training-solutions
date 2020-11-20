package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {

    private String name;
    private LocalDate dataOfBirth;
    private LocalDateTime beginEmployment;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Employee(int year, int month, int day, String name) {
        this.name = name;
        this.dataOfBirth = LocalDate.of(year, month, day);
        this.beginEmployment = beginEmployment;
    }

    public LocalDate getDataOfBirth() {
        return dataOfBirth;
    }

    public LocalDateTime getBeginEmployment() {
        return beginEmployment = LocalDateTime.now();
    }
}
