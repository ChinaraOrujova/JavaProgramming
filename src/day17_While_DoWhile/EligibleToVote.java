package day17_While_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt(); //valid age is between 1~120

        while (!(age > 0 && age <=120)) {
            System.err.println("Invalid age, please enter your age again");
            age=scan.nextInt();
        }

        System.out.println("Are you USA citizen");
        String answer = scan.next().toLowerCase();

        while(!(answer.equals("yes")||answer.equals("No"))){
            System.err.println("Invalid answer, enter yes or no");
            System.out.println("Are you USA citizen");
            answer = scan.next().toLowerCase();

            if(age>=18 &&answer.equals("yes")){
                System.out.println("You are eligible to vote");
            }else{
                System.out.println("You are not eligible to vote");
            }
        }
    }
}
