package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {
        // >,<,<=,>=

        boolean result1 = 200>40;

        System.out.println("result1 = " + result1);

        boolean result2 = 300>=150;
        System.out.println("result2 = " + result2);
        
        boolean result3 = 100>=100;
        System.out.println("result3 = " + result3);
        
        boolean result4 = 300>=500;
        System.out.println("result4 = " + result4);

        System.out.println("------------------------------------------------");
        //credit score of 720
        int creditScore = 745;

        boolean isEligibleForLoan = creditScore>=720;
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        boolean result5 = 100<120;
        System.out.println("result5 = " + result5);

        boolean result6 = 200<100;
        System.out.println("result6 = " + result6);
        
        int score = 75;
        boolean hasFailed = score <=59;

        System.out.println("hasFailed = " + hasFailed);


        System.out.println("-----------------------------------------------");


        int x = 100;
        int y = 200;

        boolean equal = x==y;
        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar"=="good guy";
        System.out.println("result8 = " + result8);

        boolean result9 = 'A'=='a';
        System.out.println("result9 = " + result9);
        
        boolean result10 = "Java" == "Java";
        System.out.println("result10 = " + result10);
        boolean result11 = "java" == "   java";
        System.out.println("result11 = " + result11);

        System.out.println(" ---------------------------------------------------");

        boolean result12 = 100!=200;
        System.out.println("result12 = " + result12);







    }
}
