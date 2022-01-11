package day26_CustomMethod;

import utilities.ArrayUtility;
import utilities.MathUtility;

public class SumOfTheNumbers {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 9;
        int sumNumbers = sum(num1, num2);
        System.out.println(sumNumbers);


        double num3=45.8;
        double num4=30.5;
        double sumNumbers1=sum(num3,num4);
        System.out.println(sumNumbers1);

    }

    //return the sum of two integers
    public static int sum(int num1, int num2) {
        int total = num1 + num2;
        return total;

    }

    //return the sum of two integers
    public static double sum(double num1, double num2) {
        double total1 = num1 + num2;
        return total1;

    }
}

