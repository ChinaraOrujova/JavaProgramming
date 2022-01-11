package day13_String;

import java.util.Locale;
import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        System.out.println("enter your word:");
        String word = scan.next();
        char thirdChar = word.charAt(3);
        System.out.println(thirdChar);
        scan.close();

        char tenthChar = word.charAt(10);
        System.out.println(tenthChar);
        scan.close();

        */
        String s1 = "Batch 25 is the best batch";
        int totalChar = s1.length();
        System.out.println("Length: "+totalChar);

        //char lastChar = s1.charAt(s1.length()-1);
        char lastChar = s1.charAt(totalChar-1);
        System.out.println("Last Character: " + lastChar);

        String str = "wooden spoon";
        str = str.toUpperCase();
        System.out.println("Upper cases:"+str);

        String s = "JAVA";
        s=s.toLowerCase();
        System.out.println("Lower case: "+s);

        //Today is a great day to learn Java Programming Language.
        String sentence = "Today is a great day to learn Java Programming Language.";
        sentence=sentence.toUpperCase();
        System.out.println(sentence);
    }
}
