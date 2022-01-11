package day30_CustomClass;

import javax.sound.midi.Soundbank;
import java.util.Collections;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1=new Employee();
        employee1.setInfo("Mike",2234,'M',"Financial Advisor",78.000, true);

        Employee employee2=new Employee();
        employee2.setInfo("Heydar",2235,'M',"IT Security Manager",135.000, true);

        Employee employee3=new Employee();
        employee3.setInfo("Chinara",2236,'F',"QA",115.000, false);

        Employee employee4=new Employee();
        employee4.setInfo("Jason",2238,'M',"Developer",250.000, true);

        Employee employee5=new Employee();
        employee5.setInfo("Jasmine",2239,'F',"Architecture",150.000, true);

        Employee[] employees={employee1,employee2,employee3,employee4,employee5};

        int countFullTime=0;
        int countPartTime=0;

        double max= employees[0].salary;
        double min =employees[0].salary;
        for (Employee employee : employees) {
            if(employee.isFullTime){
                countFullTime++;
            }else{
                countPartTime++;
            }

            if(employee.salary>max){
                max=employee.salary;
            }
            if(employee.salary<min){
                min=employee.salary;
            }

        }
        System.out.println("There are "+countFullTime+" full time employee");
        System.out.println("There are "+countPartTime+" part time employee");
        System.out.println("min: "+min);
        System.out.println("max: "+max);




    }
}
/*
CapitalOne Class:

    1. create 5 Employee objects
    2. store those 5 employee objects into an array
    3. how many employees are full time employees?
    4. What's the minimum salary
    5. what's the maximum salary
 */
