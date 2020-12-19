package stringbasic;

import java.time.LocalDate;

public class Pet {

    private String name;
    private LocalDate dateOfBirth;
    private String sex;
    private String registrationNumber;

    public String getName() {
        return name;
    }

    public Pet(String name, LocalDate dateOfBirth, String sex, String registrationNumber) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        if(sex != "hím" || sex != "nőstény" || sex != "ismeretlen"){
            throw new IllegalArgumentException("The sex must be unknown, male, or female.");
        }
        this.sex = sex;
        if (!(registrationNumber.length() >= 6)) {
            throw new IllegalArgumentException("The registration number must be six digit!");
        }
            this.registrationNumber = registrationNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
