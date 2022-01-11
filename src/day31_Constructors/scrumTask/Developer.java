package day31_Constructors.scrumTask;

public class Developer {

    public String name;
    public int employerID;
    public String jobTitle;
    public double salary;

    public Developer(String name, int employerID, String jobTitle, double salary) {
        this.name = name;
        this.employerID = employerID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public void coding(){
        System.out.println(name+ " is coding");
    }
    public void unitTesting(){
        System.out.println(name+ " is doing the unit testing");
    }
    public void fixingBug(){
        System.out.println(name+ " is fixing the bugs");
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employerID=" + employerID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }
}
/*
create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary

	          Add A constructor that can set all the fileds

	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()

 */