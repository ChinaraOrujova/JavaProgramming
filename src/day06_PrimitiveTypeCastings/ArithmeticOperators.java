package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {


        /*
        integer/integer ===> integer
        decimal/integer====>decimal
        integer/ decimal====> decimal
        decimal/decimal ====> decimal

        + : Addition
        - : Subtract
        * :Multiplication
        / : Division
              in math
                    10/4=2.5
                    100/3=3.333

               in Java
                     10/4 =2
                     10.0/4 = 2.5
                     100/3=33
        % : Remainder

         */
        System.out.println("12" + 1);
        System.out.println(10+20);
        System.out.println(100-50);
        System.out.println(10*6);

        System.out.println(100/3);//33
        System.out.println(10.0/4);
        System.out.println((double) 10/4);
        System.out.println(10/4.0);
        System.out.println(10d/4);

        int a = 100;
        double b = a/6; //16.0
        System.out.println(b);


        double c = a/6d;
        System.out.println(c);

        double n = (double) a/6;
        System.out.println(n);
    }

}
