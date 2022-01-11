package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter you programming language");
        String program = input.nextLine();

        System.out.println("Enter your full name");
        String name = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();


        input.nextLine(); // capture the Enter key that user pressed for nextInt()
        System.out.println("Enter your school name");
        String school = input.nextLine();


        System.out.println("full name: "+ name);
        System.out.println("programming: " + program);
        System.out.println("age: " + age);
        System.out.println("school: "+ school);
 input.close();

    }
}
