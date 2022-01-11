package day37_Inheritance.Scrum;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int ID, String jobTitle, double salary, String companyName) {
        super(name, age, gender, ID, jobTitle, salary, companyName);
    }
    public void testing(){
        System.out.println(name+ " is testing");

    }
    public void creatingTicket(){
        System.out.println(name + " is creating a ticket");

    }
}
