package day10_NestedIf;

public class NestedIf {

    public static void main(String[] args) {
          int age =19;
          boolean hasId = true;

        if (hasId) {
            if (age>=21){
                System.out.println("Eligible to buy alcohol");

            }else{
                System.out.println("Not eligible to buy alcohol");
            }

        }
        else {
            System.out.println("You must have an ID to buy alcohol");

        }


        System.out.println("--------------------------------------");

        int number =7;

        if (number<=7 && number>=1){//
            if (number==1){
                System.out.println("Monday");
            }else if (number ==2){
                System.out.println("Tuesday");
            }else if (number ==3){
                System.out.println("Wednesday");
            }else if (number ==4){
                System.out.println("Thursday");
            }else if (number==5){
                System.out.println("Friday");
            }else if (number ==6){
                System.out.println("Saturday");
            }else{
                System.out.println("Sunday");
            }
        }else {
            System.out.println("Invalid number");
        }
    }

}
