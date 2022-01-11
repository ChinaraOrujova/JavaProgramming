package day11_Switch_Scanner;

public class DaysInWeeks {
    public static void main(String[] args) {
        int number = 9;

        switch (number){
            case 1: // case value should be unique
                System.out.println("Monday");
            break;//exit the switch after executing the case block
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: //only gets executed if none of the case blocks are matching
                System.out.println("invalid number");
                break;


        }
    }
}
