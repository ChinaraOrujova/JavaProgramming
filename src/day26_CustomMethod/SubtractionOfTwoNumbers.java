package day26_CustomMethod;

public class SubtractionOfTwoNumbers {
    public static void main(String[] args) {
        int num1=34;
        int num2=24;
        int subNumbers=subtract(num1,num2);
        System.out.println(subNumbers);

        double num3=34.5;
        double num4=13.4;
        double subNumbers1=subtract(num3,num4);
        System.out.println(subNumbers1);

        
    }
    public static int subtract(int num1,int num2){
        int result=num1-num2;
        return result;
    }
    public static double subtract(double num1,double num2) {
        double result = num1 - num2;
        return result;
    }
    
}
