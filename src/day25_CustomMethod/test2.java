package day25_CustomMethod;
import utilities.ArrayUtility;

public class test2 {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6,7,8,9};
        ArrayUtility.printEachElements(array);
        System.out.println("----------------");

        double[] array2={1.5,2.5,3.5,4.5};
        ArrayUtility.printEachElements(array2);
        System.out.println("------------------");

        char[] array3={'A','B','C','D'};
        ArrayUtility.printEachElements(array3);
        System.out.println("------------------");

        String[] array4={"David","Elvira","Ali","Iqor"};
        ArrayUtility.printEachElements(array4);

        int[] array5={23,24,25,26,27,28};
        int max=ArrayUtility.max(array5);
        System.out.println(max);

        double[] array6={1.3,4.5,8.6,2.4};
        double maxDouble=ArrayUtility.max(array6);
        System.out.println(maxDouble);

        int[] array7={4,5,6,7,8,9};
        boolean r1=ArrayUtility.contains(array7,5);
        System.out.println(r1);


    }
}
