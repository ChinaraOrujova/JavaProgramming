package day26_CustomMethod;

import utilities.ArrayUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[] array={1,1,2,3,3,4,5,5,6,7,7,7};
        int[] unique=uniqueElements(array);
        System.out.println(Arrays.toString(unique));
        
        double[] array1={1.5,2.5,1.5,3.5,4.5,4.5,5.5,5.5};
        double[] unique1=uniqueElements(array1);
        System.out.println(Arrays.toString(unique1));

    }
    //returns the unique elements from the array as a new array
    public static int[] uniqueElements(int[] array){
        int[] result={};
        for (int each : array) {
            if(ArrayUtility.frequencyOfGivenElement(array,each)==1){
                result=ArrayUtility.addElement(result,each);
            }

        }
        return result;
    }

    //returns the unique elements from the array as a new array
    public static double[] uniqueElements(double[] array){
        double[] result={};
        for (double each : array) {
            if(ArrayUtility.frequencyOfGivenElement(array,each)==1){
                result=ArrayUtility.addElement(result,each);
            }

        }
        return result;
    }
    
    //returns the unique elements from the array as a new array
    public static char[] uniqueElements(char[] array){
        char[] result={};
        for (char each : array) {
            if(ArrayUtility.frequencyOfGivenElement(array,each)==1){
                result=ArrayUtility.addElement(result,each);
            }

        }
        return result;
    }

    //returns the unique elements from the array as a new array
    public static String[] uniqueElements(String[] array){
        String[] result={};
        for (String each : array) {
            if(ArrayUtility.frequencyOfGivenElement(array,each)==1){
                result=ArrayUtility.addElement(result,each);
            }

        }
        return result;
    }
}
