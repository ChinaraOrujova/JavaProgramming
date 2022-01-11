package day26_CustomMethod;

import utilities.ArrayUtility;

public class RemoveElement2 {
    public static void main(String[] args) {

    }
    public static int[] removeElement(int[] array,int index){
        int[] result={};
        if(index<0||index>= array.length-1){
            System.out.println("Invalid Index: "+index);
            System.exit(0);
        }

        for (int i = 0; i < array.length; i++) {
            if(i!=index){
             result=   ArrayUtility.addElement(result,array[i]);
            }
        }
        return result;
    }
}
