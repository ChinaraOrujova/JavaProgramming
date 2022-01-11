package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {
         int  num1 = 25;
         int num2 = -25;
        System.out.println( num1 < 0);
        System.out.println(num2 > 0);


        System.out.println("--------------------------------");

        int a = 5;
        ++a; //pre increment: increase the value by 1 right away

        System.out.println(a);

        --a;//pre decrement: decrease the value by 1 right away
        System.out.println(a);

        int b = 100;
        System.out.println(b++); // post increment: postpone the increment of the number
        //first passes the current value, then increases the value by 1
        System.out.println(b);

        System.out.println("--------------------------");

        int x = 200;

        System.out.println(x--); // post decrement: first passes the current value, then decrease the value by 1

        System.out.println(x);

        System.out.println("--------------------------------------");

        int z = 45;
        System.out.println(++z);// pre increment increase the value by 1: 46
        System.out.println(z++);//post increment 46
        System.out.println(z);//47

        int q = 30;
        System.out.println(--q);//pre decrement: 29
        System.out.println(q--);//post decrement: will decrease value on next step: 29
        System.out.println(q);//28



    }
}
