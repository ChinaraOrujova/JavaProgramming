package day26_CustomMethod;

import utilities.ArrayUtility;

import java.util.Arrays;

public class MergeTwoArrays2 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};
        int[] arr3=merge(arr1,arr2);
        System.out.println(Arrays.toString(arr3));

        double[] arr4={1.2,1.3,1.4,1.5,1.6};
        double[] arr5={1.7,1.8,1.9,2.0};
        double[] arr6= ArrayUtility.merge(arr4,arr5);
        System.out.println(Arrays.toString(arr6));


    }
    public static int[] merge(int[]arr1,int[] arr2){
        int[] result= new int[arr1.length+arr2.length];

        int j=0;
        for (int i = 0; i < arr1.length; i++) {
            result[j++]=arr1[i];

        }
        for (int i = 0; i < arr2.length; i++) {
            result[j++]=arr2[i];
        }
        return result;
    }
}
