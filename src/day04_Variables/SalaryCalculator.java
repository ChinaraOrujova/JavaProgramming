package day04_Variables;

public class SalaryCalculator {

    public static void main( String[] args) {
        //hourlyRate, weeklyHours

        int hourlyRate =65;
        int weeklyHours = 45;
        int numberofWeeks= 52;

        int salary= hourlyRate * weeklyHours * numberofWeeks; //yearly salary

        System.out.println(salary);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("numberofWeeks = " + numberofWeeks);
        System.out.println("salary = $" + salary);;


    }
}
