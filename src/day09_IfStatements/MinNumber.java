package day09_IfStatements;

public class MinNumber {

    public static void main(String[] args) {
        /*

         Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

            Ex:
                n1= 100, n2 = 200;

            output:
                100 is the minimum number
         */


        int n1 = 400,
                n2 = 300;
        boolean n1IsMinimum = n1<n2;
        boolean n2IsMinimum = n2<n1;
        boolean isEqual = n1 ==n2;

        if(n1IsMinimum){//if n1 is minimum number
            System.out.println(n1 + " is minimum number.");
        }
        if(isEqual){//if n1 is equal to n2
            System.out.println("The numbers are equal");
        }
        if(n2IsMinimum){//if n2 is minimum number
            System.out.println(n2 +" is minimum number");
        }


    }
}
