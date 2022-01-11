package day11_Switch_Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade){
            case 'A':
                System.out.println("excellent");
                break;
            case 'B':
                System.out.println("Great Job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
