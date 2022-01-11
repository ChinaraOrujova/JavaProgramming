package day30_CustomClass;

import java.util.ArrayList;

public class ExtractSpecialCharDigitsLetters {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        char[] ch= str.toCharArray();

        ArrayList<Character> list1=new ArrayList<>();
        ArrayList<Character> list2=new ArrayList<>();
        ArrayList<Character> list3=new ArrayList<>();


        for (char each : ch) {
            if(Character.isDigit(each)){
                list1.add(each);
            }else if(Character.isLetter(each)){
                list2.add(each);
            }else{
                list3.add(each);
            }

        }
        System.out.println("digits: "+list1);
        System.out.println("Letters: "+list2);
        System.out.println("special character: "+list3);

        System.out.println("-----------------------------");

        String str1 = "ABCD123$%#@&456EFG!";
        ArrayList<Character> chars=new ArrayList<>();

        for (int i = 0; i < str1.length(); i++) {
            chars.add(str1.charAt(i));

        }
        ArrayList<Character> letters =new ArrayList<>(chars);//add all the characters
        letters.removeIf(p->!Character.isLetter(p));//removes the characters that are not letters
        System.out.println("letters: "+letters);

        ArrayList<Character> digits=new ArrayList<>(chars);
        digits.removeIf(p->!Character.isDigit(p));
        System.out.println("Digits: "+digits);

        ArrayList<Character> specialChar =new ArrayList<>(chars);
        specialChar.removeAll(letters);
        specialChar.removeAll(digits);
        System.out.println("special characters: "+specialChar);
    }
}
