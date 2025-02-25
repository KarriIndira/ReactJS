package employee_managment_system;


public class Main {
 public static void main(String[] args) {
     
     Employee manager = new Manager("John Doe");
     Employee developer = new Developer("Jane Smith");
     Employee securityGuard = new SecurityGuard("Michael Johnson");

     
     EmployeeService employeeService = new EmployeeService();

     
     employeeService.addEmployee(manager);
     employeeService.addEmployee(developer);
     employeeService.addEmployee(securityGuard);

     
     employeeService.displayEmployees();
 }
}

