package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {
        int[] number = new int[100];

        for (int i = 1; i <=number.length; i++) {
            number[i-1]=i;
        }
        System.out.println(Arrays.toString(number));

        System.out.println("=================================");


        //numbers from 100 to 1
        int[] number1 =new int[100];


        for (int i = number1.length; i >0 ; i--) {
            number1[number1.length-i]=i;
        }
        System.out.println(Arrays.toString(number1));

        System.out.println("--------------------------------------");

        //numbers from 100 to 1
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= numbers.length-i;
        }
        System.out.println(Arrays.toString(numbers));

        /*
        Write a program that asks user to enter a number 10 times:
            1. store all user entered numbers in an array
            2. find the max number
            3. find the min number
         */
        Scanner scan = new Scanner(System.in);
        int[] userNumbers = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < userNumbers.length; i++) {


            }

        }
    }

