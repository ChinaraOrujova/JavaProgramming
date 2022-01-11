package day15_loop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);



        int minValue =Integer.MAX_VALUE;

        for (int i = 0; i < 6; i++) {
            System.out.println("Enter a number");
            int number = scan.nextInt();
            if (number<minValue){
                minValue =number;
            }
            System.out.println("Min number is: " + minValue);

        }
        scan.close();
    }
}





