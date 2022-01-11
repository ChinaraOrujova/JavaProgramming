package day37_Inheritance.Scrum;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, int age, char gender, int ID, String jobTitle, double salary, String companyName) {
        super(name, age, gender, ID, jobTitle, salary, companyName);
    }
    public void solveProblem(){
        System.out.println(name+ " is helping the scrum team members to solve their problems");
    }
    public void meeting(){
        System.out.println(name+ " is conducting the 5 different meeting for scrum team");
    }
}
