package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       // System.out.println("Please enter true or false");

       // boolean result = scan.nextBoolean();
        //System.out.println(result);

        System.out.println("enter your name");
        String name = scan.next();//next() will read the input until space

        System.out.println(name);
        scan.close();




    }
}
