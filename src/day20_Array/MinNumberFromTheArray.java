package day20_Array;

public class MinNumberFromTheArray {
    public static void main(String[] args) {
        int [] numbers ={100,30,54,23,96};
        int min =numbers[1];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println(min);
    }
}
