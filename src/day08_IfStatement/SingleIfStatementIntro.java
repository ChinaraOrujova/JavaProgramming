package day08_IfStatement;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        int num = 100;

      /*
        System.out.println("Odd Number");
        System.out.println("Even Number");
       */

        boolean evenNumber= num%2==0;
        boolean oddNumber = !evenNumber;//not even number num%2=!0
        if (evenNumber){
            System.out.println(num + " is even number");
        }
        if (oddNumber){
            System.out.println(num + " is odd number");
        }

        System.out.println("--------------------------------");
         int n = 200;
         //positive
        if(n>0){ //if the n is greater than zero, then it is positive
            System.out.println(n + " is positive");


            //negative
            if(n<0) { //if n is less than zero, then it is negative
                System.out.println(n + " is negative");

                if(n==0) {
                    System.out.println(n + " is zero");
                }



            }
        }

    }
}
