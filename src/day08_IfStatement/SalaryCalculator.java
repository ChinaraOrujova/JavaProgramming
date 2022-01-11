package day08_IfStatement;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 50;
        int weeklyHours = 45;
        int stateTax = 6;
        int federalTax = 26;



        int salaryBeforeTax = (hourlyRate* weeklyHours)*52;
        int salaryFederalTax =(salaryBeforeTax * federalTax)/100;
        int salaryStateTax =(salaryBeforeTax * stateTax)/100;
        int totalTax = salaryStateTax + salaryFederalTax;
        int netIncome = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: " + "$"+ salaryBeforeTax);
        System.out.println("Federal Tax is:  " + "$" + salaryFederalTax);
        System.out.println("State tax is: " + "$" + salaryStateTax);
        System.out.println("Total tax is: " + "$" + totalTax);
        System.out.println("Net income is: " + "$" + netIncome);


    }
}
