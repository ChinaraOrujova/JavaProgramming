package day06_PrimitiveTypeCastings;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner scan = new Scanner(System.in);
        int areaCode = scan.nextInt();
        int localNumber = scan.nextInt();


        //WRITE YOUT CODE HERE:
        String phoneNumber = areaCode + "-" + localNumber;

        System.out.println("Calling number " + phoneNumber);
    }
}