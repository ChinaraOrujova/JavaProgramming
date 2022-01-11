package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {

        char operator = '%';
        double n1 = 200.6,
                n2 = 26.3;

        boolean valid = operator =='+' || operator =='-' || operator == '*' || operator == '/';

        if (valid){
            switch (operator){
                case '+':
                    System.out.println(n1+n2);
                    break;
                case '-':
                    System.out.println(n1-n2);
                    break;
                case '*':
                    System.out.println(n1*n2);
                    break;
                default:
                    System.out.println(n1/n2);

            }

        }else {
            System.err.println("Invalid operator: " + operator);
        }
           /*
Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30

         */
    }
}
