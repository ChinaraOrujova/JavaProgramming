package day25_CustomMethod;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] array = merge(arr1, arr2);
        System.out.println(Arrays.toString(array));
        System.out.println("----------------------------");

        String[] arr3 = {"Chinara", "Zulfiyya", "Ulviyya"};
        String[] arr4 = {"Jason", "Jasmine", "Seva", "Fidan"};
        String[] array1 = merge(arr3, arr4);
        System.out.println(Arrays.toString(array1));

        char[] arr5 = {'A', 'B', 'C', 'D', 'E'};
        char[] arr6 = {'F', 'G', 'H', 'I', 'J'};
        char[] array2 = merge(arr5, arr6);
        System.out.println(Arrays.toString(array2));

        double[] arr7 = {1.1, 1.2, 1.3, 1.4, 1.5};
        double[] arr8 = {1.6, 1.7, 1.8, 1.9, 2.0};
        double[] array3 = merge(arr7, arr8);
        System.out.println(Arrays.toString(array3));


    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;

        for (int each : arr1) {
            result[i++] = each;
        }
        for (int each : arr2) {
            result[i++] = each;

        }
        return result;
    }

    public static String[] merge(String[] arr1, String[] arr2) {
        String[] result = new String[arr1.length + arr2.length];
        int i = 0;

        for (String each : arr1) {
            result[i++] = each;
        }
        for (String each : arr2) {
            result[i++] = each;

        }
        return result;
    }

    public static char[] merge(char[] arr1, char[] arr2) {
        char[] result = new char[arr1.length + arr2.length];
        int i = 0;

        for (char each : arr1) {
            result[i++] = each;
        }
        for (char each : arr2) {
            result[i++] = each;

        }
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
}
