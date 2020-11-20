package stringtype.registration;

public class UserValidator {

    public boolean isValidUsername(String username) {
        return !"".equals(username);
    }

    public boolean isValidPassword(String password1, String password2) {
        return password1.length() >= 8 && password1.equals(password2);
    }

    public boolean isValidEmail(String email) {
        int index = email.indexOf('@');
        String domain = email.substring(index + 1);
        int dotIndex = domain.indexOf('.');
        return index > 0 && dotIndex > 0 && dotIndex < domain.length() - 1;


    }
}
