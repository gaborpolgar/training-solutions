package covid;

import java.time.LocalDateTime;

public class Citizen {

    //    public static class Builder{
//
    private String fullName;
    private String zipCode;
    private int age;
    private String emailAdress;
    private String SocialSecurityNumber;
    private int id;
    private int numberOfVaccination;
    private LocalDateTime lastVaccination;
//
//    public Builder (String fullName){
//        this.fullName = fullName;
//    }
//
//    public Builder setZipCode(int zipCode)
//
//    }


    //TODO CREATE BUILDER PATTERN
    public Citizen(String fullName, String zipCode, int age, String emailAddress, String socialSecurityNumber) {
        if (fullName.isEmpty()) {
            throw new IllegalArgumentException("Must be set a full name!");
        }
        this.fullName = fullName;
        if (zipCode.isEmpty()) {
            throw new IllegalArgumentException("Must be set the Settlement' s zip code!");
        }
        this.zipCode = zipCode;
        if (!(age > 10 && age < 150)) {
            throw new IllegalArgumentException("The age must be 10 between 150!");
        }
        this.age = age;
        if (!checkEmail(emailAddress)) {
            throw new IllegalArgumentException("Te email address must be consist of at least 3 characters, and contains @ character.");
        }
        this.emailAdress = emailAddress;
        if (!check(socialSecurityNumber)) {
            throw new IllegalArgumentException("The number must be consist only and exactly ten digits");
        }
        SocialSecurityNumber = socialSecurityNumber;
        this.numberOfVaccination = 0;
        this.lastVaccination = LocalDateTime.of(2000, 01, 01, 00, 00, 00);
    }

    private boolean checkEmail(String emailAddress) {
        return emailAddress.length() >= 3 && emailAddress.contains("@");
    }

    private boolean check(String cdv) {
        if (cdv.length() != 10 || notNumber(cdv)) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int digit = Character.getNumericValue(cdv.charAt(i));
            sum += digit * (1 + i);
        }
        int tenth = sum % 11;
        return tenth == (Character.getNumericValue(cdv.charAt(9)));
    }

    private boolean notNumber(String cdv) {
        try {
            Long.parseLong(cdv);
            return false;
        } catch (NumberFormatException nfe) {
            return true;
        }
    }

    public int getNumberOfVaccination() {
        return numberOfVaccination;
    }

    public LocalDateTime getLastVaccination() {
        return lastVaccination;
    }

    public String getFullName() {
        return fullName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public int getAge() {
        return age;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public String getSocialSecurityNumber() {
        return SocialSecurityNumber;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "fullName='" + fullName + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", age=" + age +
                ", emailAdress='" + emailAdress + '\'' +
                ", SocialSecurityNumber='" + SocialSecurityNumber + '\'' +
                ", id=" + id +
                '}';
    }
}
