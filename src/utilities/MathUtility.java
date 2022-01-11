package utilities;

public class MathUtility {
    //return the sum of two integers
    public static int sum(int num1, int num2) {
        int total = num1 + num2;
        return total;

    }

    //return the sum of two decimals
    public static double sum(double num1, double num2) {
        double total1 = num1 + num2;
        return total1;

    }

    //return the subtraction of two integer numbers
    public static int subtract(int num1,int num2){
        int result=num1-num2;
        return result;
    }

    //return the subtraction of two decimal numbers
    public static double subtract(double num1,double num2) {
        double result = num1 - num2;
        return result;
    }

    //return the multiplication of two numbers
    public static int multiply(int num1, int num2){
        int result=num1*num2;
        return result;
    }

    //return the multiplication of two numbers
    public static double multiply(double num1, double num2){
        double result=num1*num2;
        return result;
    }

    //return the division of two double numbers
    public static double division(double num1, double num2){
        double result= num1/num2;
        return result;
    }

    //check if the given number is even
    public static boolean evenNumber(int num){
        boolean isEven;
        if(num%2==0) {
            isEven=true;
        }else{
            isEven=false;
        }
        return isEven;


    }

    //check if the given number is odd
    public static boolean oddNumber(int num){
        boolean isEven;
        if(num%2!=0) {
            isEven=true;
        }else{
            isEven=false;
        }
        return isEven;


    }

    //return the max number
    public static int max(int num1, int num2){
        return (num1>num2) ? num1 : num2;
    }

    //return the max number
    public static double max(double num1, double num2){
        return (num1>num2) ? num1 : num2;
    }

    //return the min number
    public static int min(int num1, int num2){
        return (num1<num2) ? num1 : num2;
    }

    //return the min number
    public static double min(double num1, double num2){
        return (num1<num2) ? num1 : num2;
    }

    //return the square of the given number
    public static int square(int num){
        return num * num;
    }


    public static double square(double num){
        return num * num;
    }


    public static int cube(int num){
        return num * num * num;
    }


    public static double cube(double num){
        return num * num * num;
    }



}
