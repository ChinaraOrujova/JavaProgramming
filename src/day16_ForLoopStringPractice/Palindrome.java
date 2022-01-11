package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");

        String word = scan.next();
        String reverse ="";

        for (int i = word.length()-1; i >=0 ; i--) {
            reverse+= word.charAt(i);

        }
        boolean isPalindrome = word.equalsIgnoreCase(reverse);
        System.out.println("Word is Palindrome: " + isPalindrome);


    }
}
/*
Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
 */