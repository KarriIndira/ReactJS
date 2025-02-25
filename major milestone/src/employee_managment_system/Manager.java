package employee_managment_system;


public class Manager extends Employee {

 public Manager(String name) {
     super(name, "Manager");
 }

 @Override
 public void performDuties() {
     System.out.println(getName() + " is managing the team and overseeing projects.");
 }
}

