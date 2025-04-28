package employee_managment_system;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        
        List<String> developerLanguages = Arrays.asList("Java", "Python", "JavaScript");
        Developer developer = new Developer("Indira", developerLanguages);

        
        List<String> patrolAreas = Arrays.asList("Main Entrance", "Parking Lot", "Server Room");
        SecurityGuard guard = new SecurityGuard("Raj", patrolAreas, "Night");

        
        List<String> teamMembers = Arrays.asList("John Doe", "Indira", "Ishu");
        Manager manager = new Manager("Ishu", teamMembers);

        
        EmployeeService employeeService = new EmployeeService();

        
        employeeService.addEmployee(developer);
        employeeService.addEmployee(guard);
        employeeService.addEmployee(manager);

        
        System.out.println("=== Employee Details ===");
        employeeService.displayEmployees();

        
        System.out.println("\n=== Assigning a Project to Developer ===");
        employeeService.assignProjectToDeveloper("Indira", "Employee Management System");

        
        System.out.println("\n=== Reporting a Security Incident ===");
        employeeService.reportSecurityIncident("Raj", "Suspicious Person in Parking Lot");

        
        System.out.println("\n=== Conducting Performance Review by Manager ===");
        employeeService.conductPerformanceReview("Ishu", "John Doe");

        
        System.out.println("\n=== Updated Employee Details ===");
        employeeService.displayEmployees();
    }
}

