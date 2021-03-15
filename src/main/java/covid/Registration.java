package covid;

public class Registration {

    private UserInputManager userInputManager;
    private CovidDao covidDao;

    public Registration(UserInputManager userInputManager, CovidDao covidDao) {
        this.userInputManager = userInputManager;
        this.covidDao = covidDao;
    }

    public void getRegistration(UserInputManager userInputManager, CovidDao dao) {
        String fullName = userInputManager.getString("Please, give the full name: ");
        String zipCode = userInputManager.getString("Please, give the zipCode: ");
        String cityByZipCode = covidDao.selectSettlementByZipCode(zipCode);
        System.out.println(cityByZipCode);
        int age = userInputManager.getNumber("Please, add the age: ");
        String emailAddress = userInputManager.getString("Please, enter the emailAddress: ");
        String controllEmail;
        do {
            controllEmail = userInputManager.getString("Please, confirm the emailAddress: ");
        } while (!controllEmail.equals(emailAddress));
        String socialSecurityNumber = userInputManager.getString("Please, add the SSN: ");
        Citizen citizen = new Citizen(fullName, zipCode, age, emailAddress, socialSecurityNumber);
        dao.insertCitizen(citizen);
    }

    public void getMassRegistration(CovidDao covidDao) {
    }
}
