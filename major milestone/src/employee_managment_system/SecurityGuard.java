package employee_managment_system;


public class SecurityGuard extends Employee {

 public SecurityGuard(String name) {
     super(name, "Security Guard");
 }

 @Override
 public void performDuties() {
     System.out.println(getName() + " is ensuring the security of the premises.");
 }
}

