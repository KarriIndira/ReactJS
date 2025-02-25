package employee_managment_system;

import java.util.List;
public class SecurityGuard extends Employee {
	private List<String> patrolAreas;
    private int incidentsReported;
    private String shift;

 public SecurityGuard(String name,List<String> patrolAreas,String shift) {
     super(name, "Security Guard");
     this.patrolAreas = patrolAreas;
     this.incidentsReported = 0;
     this.shift = shift;
 }
 public void reportIncident(String incident) {
     System.out.println(getName() + " reported an incident: " + incident);
     incidentsReported++;
 }

 public void patrolArea() {
     System.out.println(getName() + " is patrolling the areas: " + String.join(", ", patrolAreas));
 }

 @Override
 public void performDuties() {
     System.out.println(getName() + " is ensuring the security of the premises.");
     System.out.println("Patrol Areas: " + String.join(", ", patrolAreas));
     System.out.println("Total incidents reported: " + incidentsReported);
 }
 public String getShift() {
     return shift;
 }

 public void setShift(String shift) {
     this.shift = shift;
 }
}

