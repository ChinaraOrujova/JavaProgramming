package day09_IfStatements;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2000;
        boolean isLeapYear = 2000%4==0;

        if(isLeapYear){
            System.out.println(year + " is Leap Year");
        }
        if(!isLeapYear){
            System.out.println(year + " is not leap year");
        }

        System.out.println("------------------------------------------");

        if(isLeapYear){
            System.out.println(year + " is Leap Year");
        }
        else{
            System.out.println(year + " is not Leap Year");
        }



    }
}
