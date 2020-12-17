package introexception;

public class Patient {

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if (name.isBlank()){
            throw new IllegalArgumentException("The name not possible empty.");
        }
        this.name = name;
        if(!SsnValidator.isValidSsn(socialSecurityNumber)){
            throw new IllegalArgumentException("This TAJ number is not valid.");

        }
        this.socialSecurityNumber = socialSecurityNumber;
        if (yearOfBirth < 1900){
            throw new IllegalArgumentException("The year must grater than 1899.");
        }
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
