package employee_managment_system;

import java.util.List;
public class Developer extends Employee {
	private List<String> languagesKnown;
    private int codingHours;
    private int bugsFixed;

 public Developer(String name, List<String> languagesKnown) {
     super(name, "Developer");
     this.languagesKnown = languagesKnown;
     this.codingHours = 0;
     this.bugsFixed = 0;
 }
 public void workOnProject(String projectName) {
     System.out.println(getName() + " is working on the project: " + projectName);
     codingHours += 5; 
 }

 public void fixBug() {
     System.out.println(getName() + " fixed a bug.");
     bugsFixed++;
 }

 @Override
 public void performDuties() {
     System.out.println(getName() + " is writing code and working on software development.");
     System.out.println("Languages known: " + languagesKnown);
     System.out.println("Total coding hours: " + codingHours);
     System.out.println("Total bugs fixed: " + bugsFixed);
 }
 public List<String> getLanguagesKnown() {
     return languagesKnown;
 }

 public void setLanguagesKnown(List<String> languagesKnown) {
     this.languagesKnown = languagesKnown;
 }
}
