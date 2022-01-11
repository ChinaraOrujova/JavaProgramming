package day35_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {


        Employee employee1=new Employee("Chinara",'F',32,115000);
        System.out.println(employee1);

        employee1.setAge(32);

        Employee employee2=new Employee("Togrul",'M',30,115000);
        employee2.setSalary(employee1.getSalary()+15000);
        System.out.println(employee2);
    }
}
