package day20_Array;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        //create a variable that is capable enough to contain 5 names

        String [] myGroups=new String[5];
        myGroups [0]="Gunay";
        myGroups [1]="Neira";
        myGroups [2]="Suat";
        myGroups [3]="Chinara";
        myGroups [4]="Ali";

        System.out.println(Arrays.toString(myGroups));

        System.out.println("-------------------------------------");
        String [] daysOfTheWeek ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println(Arrays.toString(daysOfTheWeek));

        int number =5;
        if(number<1||number>7) {
            System.err.println("Invalid Number");
            System.exit(0);

        }
        System.out.println(daysOfTheWeek[4]);
    }
}
