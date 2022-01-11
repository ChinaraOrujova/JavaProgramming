package day26_CustomMethod;

public class Multiplication {
    public static void main(String[] args) {
        int num1=23;
        int num2=4;
        int total=multiply(num1,num2);
        System.out.println(total);

        double num3=30.4;
        double num4=4.5;
        double total1=multiply(num3,num4);
        System.out.println(total1);

    }
    public static int multiply(int num1, int num2){
        int result=num1*num2;
        return result;
    }
    public static double multiply(double num1, double num2){
        double result=num1*num2;
        return result;
    }
}
