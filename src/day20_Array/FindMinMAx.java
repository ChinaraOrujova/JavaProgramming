package day20_Array;

import java.util.Scanner;

public class FindMinMAx {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        int[] numbers =new int[10];

        int min =numbers[0];
        int max =numbers[1];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i]=scan.nextInt();//each user entered input will be assigned to the indexes of the array numbers
        if(numbers[i]>max){
            max=numbers[i];
        }
            if (numbers [i]<min){
                min=numbers[i];
            }

        }
        System.out.println("max is: "+max+"\nmin is: "+min);
        scan.close();






    }
}
