package OfficeHours;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Add the number");
        int number=scan.nextInt();

        int[] fibo=new int[number];
        fibo[0]=0;
        fibo[1]=1;
        for (int i = 2; i < number; i++) {
            fibo[i]=fibo[i-1]+fibo[i-2];

        }
        System.out.println(Arrays.toString(fibo));
    }
}
