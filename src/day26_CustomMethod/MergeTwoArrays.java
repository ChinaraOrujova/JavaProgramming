package day26_CustomMethod;

import utilities.ArrayUtility;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};

        int[] arr3=merge(arr1,arr2);
        System.out.println(Arrays.toString(arr3));

    }
    //merge the given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2){
        int[] result= {};

        for (int each:arr1){
            result= ArrayUtility.addElement(result,each);
        }
        for (int each : arr2) {
            result=ArrayUtility.addElement(result,each);

        }
        return result;
    }
}
