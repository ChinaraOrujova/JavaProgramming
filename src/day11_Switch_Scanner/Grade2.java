package day11_Switch_Scanner;

public class Grade2 {

    public static void main(String[] args) {
        char ch = 'A';
        String result="";

        switch (ch){ //or logic in switch statement
            case'A':
            case'B':
            case'C':
            case'D':
                result = "Passed";
                break;
            case'F':
                result = "Failed";
                break;
            default:
                result = "invalid";
        }
        System.out.println(result);
    }
}
