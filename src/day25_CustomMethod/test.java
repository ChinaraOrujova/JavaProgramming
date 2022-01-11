package day25_CustomMethod;
import utilities.StringUtility;

public class test {
    public static void main(String[] args) {
        String str="Java Programming Language";
        StringUtility.printEachChar(str);
        System.out.println("------------------------");


        String str1="Wooden Spoon";
        String reverse=StringUtility.reverse(str1);
        System.out.println(reverse);
        System.out.println("-------------------------");

        String str2="level";
        boolean isPalindrome=StringUtility.isPalindrome(str2);
        System.out.println(isPalindrome);


    }
}
