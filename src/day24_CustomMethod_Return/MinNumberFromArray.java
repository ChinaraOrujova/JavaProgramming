package day24_CustomMethod_Return;

public class MinNumberFromArray {
    public static void main(String[] args) {
        int[] numbers ={4,5,6,7,8,9};
        int minNumber=minNumberFromArray(numbers);
        System.out.println(minNumber);

    }
    public static int minNumberFromArray(int[] numbers){
        int min =numbers[1];
        for(int each:numbers){
            if(each<min){
                min=each;
            }
        }
        return min;
    }
}
