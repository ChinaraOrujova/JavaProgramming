package day26_CustomMethod;

import utilities.ArrayUtility;

public class ReverseArray2 {
    public static void main(String[] args) {

    }
    public static int[] reverse(int[] array){
        int[] result={};
        for (int i = array.length - 1; i >= 0; i--) {
            result= ArrayUtility.addElement(result,array[i]);
        }
        return result;
    }
}
