package day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName= scan.next();

        System.out.println("Enter your last name:");
        String lastName =scan.next();

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

        String initials = ""+ f+l;//in order to concatinate the string has to be involved


        System.out.println("Initials: "+ initials);
scan.close();
    }
}
