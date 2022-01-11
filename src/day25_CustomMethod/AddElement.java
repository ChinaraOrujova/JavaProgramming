package day25_CustomMethod;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int[]array= {1,2,3,4};
        array=addElement(array,8);
        System.out.println(Arrays.toString(array));

        char[] array1={'A','B','C','D'};
        array1=addElement(array1,'E');
        System.out.println(Arrays.toString(array1));

        String[] array2={"Ali","Yasaman","Togrul","Elvin","Chinara"};
        array2=addElement(array2,"Muhtar");
        System.out.println(Arrays.toString(array2));



    }

    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length+1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;

    }
    public static double[] merge(double[] arr1, double[] arr2) {
        double[] result = new double[arr1.length + arr2.length];
        int i = 0;

        for (double each : arr1) {
            result[i++] = each;
        }
        for (double each : arr2) {
            result[i++] = each;

        }
        return result;
    }

    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length+1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length+1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }
}

