package day20_Array;

public class FindingTheMAxFromArray {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0];//10, we just assuming that first number is greater

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] > max) {// if there is elemenet in the array that is greater that the current max number
                max = numbers[i];
            }

        }
        System.out.println(max);
    }
}

