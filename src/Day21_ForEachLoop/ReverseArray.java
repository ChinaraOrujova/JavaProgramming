package Day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] numbers ={10,20,30,40,50};
        int[] reverse =new int[numbers.length];//make sure that array has enough capacity to contain all the elements of first array

        /*
                j           i
        reverse[0]=numbers[numbers.length-1];
        reverse[1]=numbers[2];
        reverse[2]=numbers[1];
        reverse[3]=numbers[0];

         */


            for (int i = numbers.length - 1,j=0;i >= 0; i--,j++) {
                reverse[j]=numbers[i];

            }
        System.out.println(Arrays.toString(reverse));
        }
    }

