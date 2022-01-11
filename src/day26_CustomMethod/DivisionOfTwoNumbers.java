package day26_CustomMethod;

public class DivisionOfTwoNumbers {
    public static void main(String[] args) {
        double num1 =34.0;
        double num2 =2.0;
        double resultDivision= division(num1,num2);
        System.out.println(resultDivision);

    }
    public static double division(double num1, double num2){
        double result= num1/num2;
        return result;
    }
}
