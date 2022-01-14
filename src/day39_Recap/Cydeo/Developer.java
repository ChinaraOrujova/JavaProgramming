package day39_Recap.Cydeo;

public class Developer extends Employee {

    public void fixingBugs(){
        System.out.println(getName()+" is fixing the codes");
    }

    public Developer(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }
}
