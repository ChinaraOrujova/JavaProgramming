package day31_Constructors.scrumTask;

public class Tester {

    public String name;
    public int employerID;
    public String jobTitle;
    public double salary;

    public Tester(String name, int employerID, String jobTitle, double salary) {
        this.name = name;
        this.employerID = employerID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void smokeTesting(){
        System.out.println(name+" is doing Smoke Testing");

    }
    public void creatingTicket(){
        System.out.println(name+ " is creating the ticket");

    }
    public void dailyStandUp(){
        System.out.println(name+ " is attending in Stand Up Meeeting");

    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employerID=" + employerID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }
}
/*
Scrum Task:
	create a class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary

	        Add A constructor that can set all the fileds

	        Actions:
	           smokeTesting(),  creatingTicket(), dailyStandUp() toString()

 */