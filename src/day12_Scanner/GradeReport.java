package day12_Scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Please enter your score");
        int grade =scan.nextInt();


    }
}
/*
GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
 */