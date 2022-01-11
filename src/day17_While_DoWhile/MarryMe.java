package day17_While_DoWhile;

import java.util.Scanner;

public class MarryMe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me? Yes or No?");
        String answer = scan.next();

        while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
            System.out.println("Invalid answer, please enter Yes or No");
            answer = scan.next();
        }
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Congrats");
        }else{
            System.out.println("Goodbye");
        }
    }
}
