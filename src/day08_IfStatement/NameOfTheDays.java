package day08_IfStatement;

public class NameOfTheDays {

    public static void main(String[] args) {

        /*
Create a class called NameOfTheDay, write a program that can display the name of the day

            number = 1 ~ 7

         */

      int number = 3;

      boolean monday= number ==1,
              tuesday = number ==2,
              wednesday = number ==3,
              thursday = number ==4,
              friday = number ==5,
              saturday = number ==6,
              sunday = number ==7;

      if(sunday){
          System.out.println("Sunday");
      }
        if(monday){
            System.out.println("Monday");
        }

        if(tuesday){
            System.out.println("Tuesday");
        }
        if(wednesday){
            System.out.println("Wednesday");
        }
        if(thursday){
            System.out.println("Thurday");
        }
        if(friday){
            System.out.println("Friday");
        }
        if(saturday){
            System.out.println("Saturday");
        }

    }

}










