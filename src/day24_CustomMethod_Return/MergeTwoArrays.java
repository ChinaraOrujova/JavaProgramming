package day24_CustomMethod_Return;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,5,6};
        int[]arr2={7,8,9,10,11,12};
        int[] newMergeArray=mergeArray(arr1,arr2);
        System.out.println(Arrays.toString(newMergeArray));

    }
    public static int[] mergeArray(int[]arr1,int[]arr2){
        int[] merge= new int[arr1.length+arr2.length];
       int i=0;//index number of new merged array
        for(int each:arr1){
            merge[i]=each;
            i++;
        }
        for(int each:arr2){
            merge[i]=each;
            i++;
        }
        return merge;
    }
}
