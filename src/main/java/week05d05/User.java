package week05d05;

public class User {

    public static void main(String[] args) {

        User user = new User("Polgar", "Gabor", "gabor.polgar@gmail.com");
        System.out.println(user.getFullName());
    }

    private String firstName;
    private String lastname;
    private String email;

    public User(String firstName, String lastname, String email) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.email = email;
        if (!((email.contains("@")) || !(email.contains(".")))) {
            System.out.println("Nem megfelelő email címet adott meg.");
        }
    }

    public String getFullName() {
        return firstName + " " + lastname;
    }
}
