package day15_loop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        //int maxNumber=-2147483648;
        int maxNumber=Integer.MIN_VALUE;

        for (int i = 0; i < 6; i++) {
            System.out.println("Enter a number");
            int number = scan.nextInt();
            if (number>maxNumber){
                maxNumber =number;
            }
            System.out.println("max number is: " + maxNumber);


        }
        scan.close();
    }
}
