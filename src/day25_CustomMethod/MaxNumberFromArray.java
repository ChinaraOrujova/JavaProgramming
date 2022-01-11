package day25_CustomMethod;

public class MaxNumberFromArray {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6};
        System.out.println(maxNumber(array));

        double[] array1={1.1,1.2,1.3,1.4};
        System.out.println(maxNumber(array1));

    }
    public static int maxNumber(int[] array){

        int max = array[1];
        for (int each : array) {
            if(each>max){
                max=each;
            }

        }
        return max;

    }
    public static double maxNumber(double[] array){

        double max=array[1];
        for (double each:array){
            if(each>max){
                max=each;
            }
        }
        return max;
    }

}
