package day17_While_DoWhile;

import java.util.Scanner;

public class Login1 {

    public static void main(String[] args) {
        //username: "Cydeo"
        // password: "Cydeo123"

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your username");
        String userName = scan.next();


        System.out.println("Enter your password");
        String password = scan.next();

        int attempts;

        for (int i = 1; i <= 3; i++) {

            if (userName.equals("Cydeo") && password.equals("Cydeo123")) {//if credentials are valid
                System.out.println("You have logged in");
                break;
            } else {
                attempts = 3;
                System.out.println("Incorrect username or password, you have left " + i + " attempt");
                System.out.println("Enter your username");
                userName = scan.next();
                System.out.println("Enter your password");
                password = scan.next();
            }
            if (attempts == 3) {
                System.out.println("Your account is locked");



            }


            scan.close();

        }
    }
}


