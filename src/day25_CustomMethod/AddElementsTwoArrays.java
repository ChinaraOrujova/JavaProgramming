package day25_CustomMethod;

import java.util.Arrays;

public class AddElementsTwoArrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        array = addInteger(array, 6);
        System.out.println(Arrays.toString(array));

        System.out.println("-----------------------------");
        double[] arr2 = {1.5, 2.5, 3.5, 4.5};
        arr2 = addDouble(arr2, 7.5);
        System.out.println(Arrays.toString(arr2));
        System.out.println("----------------------");
        String[] names = {"Tatiana", "Oleksandr", "Cassandra", "Ali"};
        names = addString(names, "Neira");
        System.out.println(Arrays.toString(names));
        System.out.println("-------------------------------");

        char[] chars ={'A','B','C','D'};
        chars=addChar(chars,'E');
        System.out.println(Arrays.toString(chars));


    }

    public static int[] addInteger(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;//index numbers of new array we created
        for (int each : array) {
            result[i++] = each;

        }
        result[i] = element;
        return result;
    }
    public static double[] addDouble(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }
    public static String[] addString(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;

    }
    public static char[] addChar(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;

    }

}
