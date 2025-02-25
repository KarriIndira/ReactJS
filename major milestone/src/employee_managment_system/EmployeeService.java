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
}
