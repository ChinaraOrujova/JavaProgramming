package day37_Inheritance.Scrum;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int ID, String jobTitle, double salary, String companyName) {
        super(name, age, gender, ID, jobTitle, salary, companyName);
    }

    public void coding(){
        System.out.println(name+ " is coding");
    }
    public void fixingBugs(){
        System.out.println(name+ " is fixing the bugs");
    }
}
