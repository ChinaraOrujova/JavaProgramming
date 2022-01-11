package day18_NestedLoop;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is even number");
            } else {
                System.out.println(num + " is odd number");
            }

            System.out.println("Would you like to enter another number");
            String a = scan.next().toLowerCase();

            while(!(a.equals("no")||a.equals("yes"))){
                System.out.println("Invalid entry, please re enter. You can enter YES or NO");
                a = scan.next().toLowerCase();
            }

                if(a.equals("no")){
                    break;
                }
            }
            scan.close();

        }
    }

