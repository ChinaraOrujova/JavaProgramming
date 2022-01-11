package day24_CustomMethod_Return;

public class MaxNumberFromArray {
    public static void main(String[] args) {
        int[]numbers={1,2,3,4,5,6};
        int maxNumber=maxNumberFromArray(numbers);
        System.out.println(maxNumber);

    }
    public static int maxNumberFromArray(int[] numbers){
        int max= numbers[1];
        for( int each:numbers){
            if(each>max){
                max=each;
            }
        }
        return max;

    }

}
