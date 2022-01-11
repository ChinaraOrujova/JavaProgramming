package day26_CustomMethod;

import java.util.Arrays;

public class RemoveElements1 {
    public static void main(String[] args) {
        int[] numbers={100,200,300,400,500};
        numbers=removeElements(numbers,1);
        System.out.println(Arrays.toString(numbers));

    }

    //removes the index from the array, return the new array
    public static int[] removeElements(int[] array,int index){
        if(index<0||index>= array.length-1){
            System.out.println("Invalid Index: "+index);
            System.exit(0);
        }
        int[] result=new int[array.length-1];

        int j=0;//index number of new created array
        for (int i=0;i< array.length;i++) {
            if(i==index){
                continue;
            }
            result[j++]=array[i];
        }
        return result;

    }
}
