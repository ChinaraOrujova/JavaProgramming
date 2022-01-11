package day15_loop;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email:");
        String email = scan.next();

        if(email.endsWith("@gmail.com")){
            System.out.println("It is a valid email");
        }else{
            System.out.println("It is not valid email");
        }

scan.close();


        /*
        write a program to verify if the gmail is valid
            requirements:
                    a valid gmail account should end with @gmail.com
         */
    }
}
