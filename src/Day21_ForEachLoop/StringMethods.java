package Day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str ="Java";
        char[] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));

        for(char each:ch){//get the each element of String
            System.out.println(each);
        }

        String str1 = "I love learning java programming language";
        String[] words=str1.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("----------------------------");
        String email = "WoodenSpoon@cydeo.com";
        String[] array =email.split("@");
        System.out.println(Arrays.toString(array));

        System.out.println("--------------------");
        String s ="Today is nice weather. Today is Monday. Today we leaned Java.";
        String[] sentences =s.split("\\.");
        System.out.println(Arrays.toString(sentences));


    }
}
