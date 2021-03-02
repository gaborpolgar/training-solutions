package covid;

public class Citizen {

    private String fullName;
    private int zipCode;
    private int age;
    private String emailAdress;
    private int SocialSecurityNumber;
    private int id;

    //TODO CREATE BUILDER PATTERN
    public Citizen(String fullName, int zipCode, int age, String emailAdress, int socialSecurityNumber) {
        this.fullName = fullName;
        this.zipCode = zipCode;
        this.age = age;
        this.emailAdress = emailAdress;
        SocialSecurityNumber = socialSecurityNumber;
    }
}
