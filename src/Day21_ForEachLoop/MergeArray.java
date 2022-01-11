package Day21_ForEachLoop;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {

        int[] arr1={1,2,3};
        int[] arr2={4,5};

        int[] merge = new int[arr1.length+arr2.length];

        int i =0;//index number of new merge array

        for (int each : arr1) {
            merge[i++]=each;

        }
        for (int each : arr2) {
            merge[i++]=each;
        }
        System.out.println(Arrays.toString(merge));

        System.out.println("==================================");

        char[] ch1={'A','B','C'};
        char[] ch2={'D','E','F','G','H'};

        char[] chars =new char[ch1.length+ch2.length];

        int j =0;
        for (char ch : ch1) {
            chars[j++]=ch;

        }
        for (char ch:ch2){
            chars[j++]=ch;
        }
        System.out.println(Arrays.toString(chars));
    }
}
