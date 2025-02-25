package employee_managment_system;


public class Developer extends Employee {

 public Developer(String name) {
     super(name, "Developer");
 }

 @Override
 public void performDuties() {
     System.out.println(getName() + " is writing code and working on software development.");
 }
}
