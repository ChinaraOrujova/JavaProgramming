package day20_Array;

import java.util.Arrays;

public class Month {
    public static void main(String[] args) {
        String[] month ={"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println(Arrays.toString(month));

        int number =1;

        if(number<1||number>12){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        System.out.println(month[number-1]);
    }
}
