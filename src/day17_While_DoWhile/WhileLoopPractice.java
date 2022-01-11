package day17_While_DoWhile;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void Main(String[]args){

        //username: "Cydeo"
        //password: "Cydeo123"

        Scanner scan =new Scanner(System.in);

        int attempt =3;
        System.out.println("Enter your username");
        String userName = scan.next();


        System.out.println("Enter your password");
        String password = scan.next();

        while(!(userName.equals("Cydeo")&&password.equals("Cydeo123"))){
            for (int i = 3; i > 0; i--) {
                attempt++;
                System.out.println("Enter correct username or password, you have left"+ attempt+" attempt");

            }
        }
        System.out.println("You have logged in");

    }
}
