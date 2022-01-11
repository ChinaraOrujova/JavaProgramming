package day20_Array;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int numLength = scan.nextInt();

        if(numLength<=0){
            System.out.println("Invalid entry");
            System.exit(0);
        }
        int average =0;
        int[]numbers = new int[numLength];
        for (int i = 0; i < numLength; i++) {
            System.out.println("Please enter a number");
            numbers[i]= scan.nextInt();



        }

    }
}
