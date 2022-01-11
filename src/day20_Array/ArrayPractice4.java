package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int lengthNum=scan.nextInt();

        if(lengthNum<=0){
            System.err.println("Invalid Entry");
            System.exit(0);
        }
        int[] numbers = new int[lengthNum];//array needs to have enough capacity to contain all the elements user going to inter

        for (int i = 0; i < lengthNum; i++) {
            System.out.println("Enter a number");
            numbers[i]= scan.nextInt();

        }
        System.out.println(Arrays.toString(numbers));
        scan.close();
    }
}
