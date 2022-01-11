package day13_String;

import java.util.Scanner;

public class StringIntro {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = "Wooden Spoon";
        String name1 = "Wooden Spoon";
        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon";

        System.out.println(name == name1);
        System.out.println(name1==name2);
        System.out.println(name2==name3);

        String str = new String("Java");
        String str1 = new String("Java");
        String str2 = new String("Java");

        System.out.println(str==str1);
        System.out.println(str1==str2);
        System.out.println(str==str2);

        String s3 ="Java";
        String s4 =new String("Java");

        System.out.println(s3.equals(s4));


    }
}
