package day24_CustomMethod_Return;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int[]numbers ={5,6,7,8,9,10,11,12};
        int[] reverse=reversedArray(numbers);
        System.out.println(Arrays.toString(reverse));


    }
    public static int[] reversedArray(int[]numbers) {
        int[] reversed = new int[numbers.length];
        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = numbers[i];

        }
        return reversed;
    }
    }

