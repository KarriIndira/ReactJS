package employee_managment_system;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Creating Developer with languages known
        List<String> developerLanguages = Arrays.asList("Java", "Python", "JavaScript");
        Developer developer = new Developer("Indira", developerLanguages);

        // Creating Security Guard with patrol areas and shift
        List<String> patrolAreas = Arrays.asList("Main Entrance", "Parking Lot", "Server Room");
        SecurityGuard guard = new SecurityGuard("Raj", patrolAreas, "Night");

        // Creating Manager with team members
        List<String> teamMembers = Arrays.asList("John Doe", "Indira", "Ishu");
        Manager manager = new Manager("Ishu", teamMembers);

        // Creating EmployeeService to manage employees
        EmployeeService employeeService = new EmployeeService();

        // Adding employees to EmployeeService
        employeeService.addEmployee(developer);
        employeeService.addEmployee(guard);
        employeeService.addEmployee(manager);

        // Display employees and their duties
        System.out.println("=== Employee Details ===");
        employeeService.displayEmployees();

        // Assigning a project to Developer
        System.out.println("\n=== Assigning a Project to Developer ===");
        employeeService.assignProjectToDeveloper("Indira", "Employee Management System");

        // Reporting a security incident by the Security Guard
        System.out.println("\n=== Reporting a Security Incident ===");
        employeeService.reportSecurityIncident("Raj", "Suspicious Person in Parking Lot");

        // Conducting a performance review by the Manager
        System.out.println("\n=== Conducting Performance Review by Manager ===");
        employeeService.conductPerformanceReview("Ishu", "John Doe");

        // Display updated employees and their duties again
        System.out.println("\n=== Updated Employee Details ===");
        employeeService.displayEmployees();
    }
}

