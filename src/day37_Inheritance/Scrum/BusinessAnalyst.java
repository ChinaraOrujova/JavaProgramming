package day37_Inheritance.Scrum;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, int age, char gender, int ID, double salary, String companyName) {
        super(name, age, gender, ID, "Business Analyst", salary, companyName);
    }

    public void createAC() {
        System.out.println(name + " is helped the PO to create Acceptance Criteria");
    }
}
