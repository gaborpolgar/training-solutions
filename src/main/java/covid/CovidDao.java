package covid;

import javax.sql.DataSource;
import java.sql.*;

public class CovidDao {

    private DataSource dataSource;

    public CovidDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertCitiesWithZipCode(String zipCode, String city) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into cities(zip, city) values (?,?)")) {
            stmt.setString(1, zipCode);
            stmt.setString(2, city);
            stmt.executeUpdate();
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Can not insert the cities", sqlException);
        }
    }

    public String selectSettlementByZipCode(String zipCode) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select city from cities where zip =?")) {
            stmt.setString(1, zipCode);
            String settlement = selectSettlementByPreparedStatement(stmt);
            return settlement;
        } catch (SQLException sqlException) {
            throw new IllegalArgumentException("Cannot select from database", sqlException);
        }
    }

    private String selectSettlementByPreparedStatement(PreparedStatement stmt) {
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                return rs.getString("city");
            }
        } catch (SQLException sqlException) {
            throw new IllegalArgumentException("Wrong statement", sqlException);
        }
        throw new IllegalStateException("Can not found settlement with this zip code");
    }

    public void insertCitizen(Citizen citizen) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into citizens (citizen_name, zip, age, email, taj, number_of_vaccination, last_vaccination) values (?,?,?,?,?,?,?)")) {
            stmt.setString(1, citizen.getFullName());
            stmt.setString(2, citizen.getZipCode());
            stmt.setLong(3, citizen.getAge());
            stmt.setString(4, citizen.getEmailAdress());
            stmt.setString(5, citizen.getSocialSecurityNumber());
            stmt.setInt(6, citizen.getNumberOfVaccination());
            stmt.setTimestamp(7, Timestamp.valueOf(citizen.getLastVaccination()));
            stmt.executeUpdate();
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Can not insert the citizen", sqlException);
        }

    }
}