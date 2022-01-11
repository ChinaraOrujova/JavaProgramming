package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {
        int n =100;
        if (n%2 ==0){
            System.out.println("Even");//String
        }else{
            System.out.println("Odd"); //String
        }
        System.out.println("-----------------------------------");

        String result1 = (n%2== 0)? "Even": "Odd";

        System.out.println(result1);

        System.out.println("----------------------------------------");

        int age = 23;
        /*
        if( age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }

         */
        String isEligible = (age>=21)?"Eligible":"Not Eligible";
        //System.out.println((age>=21)?"Eligible":"Not Eligible");
        System.out.println(isEligible);

        System.out.println("----------------------------------------");

        int number = 100;
       /*
        if (number>0){
            System.out.println("Positive");
        }else if (number<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

        */
        String isPositive = (number>0)? "Positive":(number<0)? "Negative":"Zero";
        System.out.println(isPositive);

        System.out.println("-------------------------");



    }
}
