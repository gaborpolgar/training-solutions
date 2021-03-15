package covid;

import activitytrackerdao.FileReader;
import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.util.Map;
import java.util.Scanner;

public class Covid {

    public static void main(String[] args) {
        MariaDbDataSource dataSource = setDataSource();
        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();
        CovidDao covidDao = new CovidDao(dataSource);
        Map<String, String> cities = new FileReader().readFromFileCities();
        for (Map.Entry<String, String> entrySet : cities.entrySet()) {
            covidDao.insertCitiesWithZipCode(entrySet.getKey(), entrySet.getValue());
        }

        try (Scanner scanner = new Scanner(System.in)) {
            UserInputManager userInputManager = new UserInputManager(scanner);
            Menu menu = new Menu(userInputManager);
            menu.print();
            switch (menu.choose()) {
                case 1:
                    new Registration(userInputManager, covidDao).getRegistration(userInputManager, covidDao);
                    break;
                case 2:
                    new Registration(userInputManager, covidDao).getMassRegistration(covidDao);
            }
        }
    }

    private static MariaDbDataSource setDataSource() {
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3307/covid?userUnicode=true");
            dataSource.setUser("root");
            dataSource.setPassword("Stratega85");
            return dataSource;
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot connect the database", sqlException);
        }
    }
}
