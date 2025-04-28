package employee_managment_system;


import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

 private List<Employee> employees;

 
 public EmployeeService() {
     employees = new ArrayList<>();
 }

 
 public void addEmployee(Employee employee) {
     employees.add(employee);
 }

 
 public void displayEmployees() {
     for (Employee employee : employees) {
         System.out.println(employee.getRole() + ": " + employee.getName());
         employee.performDuties();
     }
 }

     public void assignProjectToDeveloper(String developerName, String project) {
         for (Employee employee : employees) {
             if (employee instanceof Developer && employee.getName().equals(developerName)) {
                 ((Developer) employee).workOnProject(project);
             }
         }
     }

     public void reportSecurityIncident(String guardName, String incident) {
         for (Employee employee : employees) {
             if (employee instanceof SecurityGuard && employee.getName().equals(guardName)) {
                 ((SecurityGuard) employee).reportIncident(incident);
             }
         }
     }

     public void conductPerformanceReview(String managerName, String teamMember) {
         for (Employee employee : employees) {
             if (employee instanceof Manager && employee.getName().equals(managerName)) {
                 ((Manager) employee).conductPerformanceReview(teamMember);
             }
         }
 }
}
