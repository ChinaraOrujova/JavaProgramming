package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number between 1 to 7");

        int number = input.nextInt();
        String result ="";
        if (number >=1 && number <=7){
            switch (number){
                case 1:
                    result ="Monday";
                    break;
                case 2:
                    result = "Tuesday";
                    break;
                case 3:
                    result = "Wednesday";
                    break;
                case 4:
                    result = "Thursday";
                    break;
                case 5:
                    result = "Friday";
                    break;
                case 6:
                    result ="Saturday";
                    break;
                default:
                    result = "Sunday";
            }
        }else {
            result = "Invalid";
        }
        System.out.println(result);
        input.close();
    }
}
