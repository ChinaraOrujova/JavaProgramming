package day20_Array;

import java.util.Arrays;

public class ArrayPractice1 {
    public static void main(String[] args) {
        // store the elements: 10,20,50,70

        int[] elements ={10,20,50,70};//4
        System.out.println(Arrays.toString(elements));

        System.out.println("-------------------------");
        int[]score=new int[5];
        System.out.println(Arrays.toString(score));
        score[1]=85;
        score[score.length-1]=95;
        score[3]=75;
        score[0]=65;
        score[2]=55;
        System.out.println(Arrays.toString(score));

        System.out.println("----------------------------------");
        String[] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        for (int i = 0; i < month.length; i++) {//represent the index number of array starting from 0)
            System.out.println(month[i]);
        }

            System.out.println("----------------------------");

            for (int j = month.length-1; j >=0 ; j--) {
                System.out.println(month[j]);

            }

        }



    }

