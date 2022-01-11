package day17_While_DoWhile;

import java.util.Scanner;

public class UserNamePassword {
    public static void main(String[] args) {

        //username: "Cydeo"
        //password: "Cydeo123"

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your username");
        String userName = scan.next();


        System.out.println("Enter your password");
        String password = scan.next();



        if (userName.equals("Cydeo") && password.equals("Cydeo123")) {//if credentials are valid
            System.out.println("You have logged in");
        }else {
            int attempt = 3;
            while (!(userName.equals("Cydeo") && password.equals("Cydeo123")) && attempt > 0) {

                System.out.println("Incorrect username or password, you have left " + attempt + " attempt");
                System.out.println("Enter your username");
                userName = scan.next();
                System.out.println("Enter your password");
                password = scan.next();
                attempt--;
            }
            if (userName.equals("Cydeo") && password.equals("Cydeo123")) {
                System.out.println("You have logged in");
            } else {
                System.out.println("Your account is locked");
            }
        }

            scan.close();

        }
    }

