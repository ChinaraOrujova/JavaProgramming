package day15_loop;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {
        String str = "Cydeo School";
        boolean r1 = str.isBlank();
        System.out.println(r1);



        String str2 ="";
        System.out.println(str2.isBlank());

        System.out.println("-------------------------------");

        String s1 = "CYdeo";
        String s2 = "cydeo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));



        System.out.println("yeS".equals("Yes"));
        System.out.println("Yes".equalsIgnoreCase("yes"));

        System.out.println("--------------------------------");
        String sentence = "My favorite programming is Java";
        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 =sentence.toLowerCase().contains("java");
        boolean hasJava4= sentence.contains("java")||sentence.contains("Java");

        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);


        System.out.println("-----------------------------");
        String input1= "I love Java";
        String input2 = "Java";
        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));

        System.out.println(input1.contains("Java"));
        System.out.println(input1.toLowerCase().contains("java"));

        System.out.println("--------------------------------");
        String a = "Wooden Spoon";

       boolean x = a.startsWith("Woo");
        System.out.println(x);

        boolean y = a.startsWith("oo");
        System.out.println(y);

        boolean z =a.toLowerCase().endsWith("spoon");
        System.out.println(z);

    }
}
