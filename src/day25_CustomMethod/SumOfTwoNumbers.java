package day25_CustomMethod;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        int sum=sumOf2numbers(3,5);
        System.out.println(sum);

        int sum2=sumOf3Numbers(4,7,15);
        System.out.println(sum2);

        int sum3=sumOf4Numbers(56,67,98,12);
        System.out.println(sum3);

    }
    public static int sumOf2numbers(int number1,int number2){
        return number1+number2;
    }
    public static int sumOf3Numbers(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    public static int sumOf4Numbers(int num1,int num2, int num3,int num4){
        return  num1+num2+num3+num4;
    }
}
