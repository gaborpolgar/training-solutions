package covid;

public class Messages {
    public static String getUserInputMessage() {
        return "Please, choose from the following menu options: ";
    }

    public static String getErrorMenuMessage() {
        return "You gave invalid menu option.";
    }

    private static String pleaseEnter() {
        return "Please enter the ";
    }

    public static String getfullName() {
        return pleaseEnter() + "full name: ";
    }

    public static String getZipCode() {
        return pleaseEnter() + "zip Code: ";
    }

    public static String getAge() {
        return pleaseEnter() + "age: ";
    }

    public static String getEmailAdress() {
        return pleaseEnter() + "email adress: ";
    }

    public static String getSocialSecurityNumber() {
        return pleaseEnter() + "soical security number: ";
    }

}