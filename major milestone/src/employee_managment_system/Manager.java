package employee_managment_system;
import java.util.ArrayList;
import java.util.List;
public class Manager extends Employee {
	private List<String> teamMembers;
    private List<String> projectsManaged;
    private double budget;

 public Manager(String name,List<String> teamMembers) {
     super(name, "Manager");
     this.teamMembers = teamMembers;
     this.projectsManaged = new ArrayList<>();
     this.budget = 0.0;
 
 }
 public void assignProject(String project) {
     projectsManaged.add(project);
     System.out.println(getName() + " is overseeing the project: " + project);
 }

 public void conductPerformanceReview(String teamMember) {
     System.out.println(getName() + " is conducting a performance review for " + teamMember);
     
 } 

 @Override
 public void performDuties() {
     System.out.println(getName() + " is managing the team and overseeing projects.");
     System.out.println("Team members: " + String.join(", ", teamMembers));
     System.out.println("Projects managed: " + String.join(", ", projectsManaged));
     System.out.println("Budget: $" + budget);
 }
 public double getBudget() {
     return budget;
 }

 public void setBudget(double budget) {
     this.budget = budget;
 }
}

