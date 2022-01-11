package day26_CustomMethod;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] array={1,2,3,4,5,6};
        int[] reverse=reverse(array);
        System.out.println(Arrays.toString(reverse));

    }
    public static int[] reverse(int[] array){
        int[]result=new int[array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--,j++) {
            result[j]=array[i];


        }
        return result;
    }
}
