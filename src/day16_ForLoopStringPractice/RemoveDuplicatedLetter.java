package day16_ForLoopStringPractice;

import java.util.Scanner;

public class RemoveDuplicatedLetter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.next();
        String result = "";
//i<=7 ===>i<8
        for (int i = 0; i < str.length(); i++) {//i <=str.length() -1; i:represent the all the index numbers of str(start from 0)
            String ch =""+ str.charAt(i);//represent each Character of str
            if (!result.contains(ch)) {//if the character is not contain in the result the character will be added to the result
                result += ch;

            }
        }
        System.out.print(result);

    }
}
/*
Write a program that can remove the duplicated characters from a String
            Ex:
                input:
                    AABBCCBC

                Output:
                    ABC

            Hint: You can add each characters of the string into another String
                  Condition: the character is not contained in the other String yet before you are adding
 */