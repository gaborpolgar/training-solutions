package timesheet;

import exam03.Histogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {

    private InputStream employeesFile;
    private InputStream projectsFile;
    private Map<String, Employee> employees = new HashMap<>();
    private Map<String, Project> projects = new HashMap<>();

    public Company(InputStream employeesFile, InputStream projectsFile) {
        this.employeesFile = employeesFile;
        readEmployeesNames(employeesFile);
        this.projectsFile = projectsFile;
    }

    private void readEmployeesNames(InputStream employeesFile) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(employeesFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] nameParts = line.split(" ");
                new Employee(nameParts[0], nameParts[1]);
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("The file can not read.", ioe);
        }
    }

    public void addTimeSheetItem(Employee employee, Project project, LocalDateTime beginDate, LocalDateTime endDate) {

    }

    public List<ReportLine> calculateProjectByNameYearMonth(String employeeName, int yera, int month) {
        List<ReportLine> result = new ArrayList<>();
        return result;
    }

    public void printToFile(String employeeName, int year, int month, Path file) {

    }


    public Map< String, Employee> getEmployees() {
        return new HashMap<>(employees);
    }

    public Map<String, Project> getProjects() {
        return new HashMap<>(projects);
    }
}
