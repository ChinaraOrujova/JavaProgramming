package day15_loop;

import java.util.Scanner;

public class ValidWebsite {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the website");
        String website = scan.next();

        if(website.startsWith("www.")&& website.endsWith(".com")||website.endsWith(".edu")||website.endsWith(".gov")){
            System.out.println("It is a valid website");
        }else{
            System.out.println("It is not a valid website");
        }
scan.close();

    }
}
