package day08_IfStatement;

public class SwapTwoVariables_WithTemporaryVariable {

    public static void main( String[] args){
     int a = 10, b=15;

     // ------------------------------ we have to assign temporary variable (as temp, or c, or k)a

        int temp=a;
        a=b;
        b=temp;
     // -------------------------------
        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }
}
