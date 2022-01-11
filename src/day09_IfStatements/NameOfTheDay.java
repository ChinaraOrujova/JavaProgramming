package day09_IfStatements;

public class NameOfTheDay {
    public static void main(String[] args) {

        /*
Create a class called NameOfTheDay, write a program that can display the name of the day

            number = 1 ~ 7

         */

        int number = 5; //1~7
        String day;


        if(number==1){
            //System.out.println("Monday");
            day="Monday";
        }
        else if (number==2){
            //System.out.println("Tuesday");
            day = "Tuesday";
        }

        else if(number==3){
            //System.out.println("Wednesday");
            day = "Wednesday";

        }
        else if(number==4){
            //System.out.println("Thursday");
            day = "Thursday";
        }
        else if(number ==5){
            //System.out.println("Friday");
            day = "Friday";
        }
        else if(number==6){
            //System.out.println("Saturday");
            day = "Saturday";
        }
        else{
            //System.out.println("Sunday");
            day = "Sunday";
        }

        System.out.println("day is: " + day);

    }

}



