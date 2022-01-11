package day26_CustomMethod;

public class EvenNumberOrOddNumber {
    public static void main(String[] args) {
        int num=33;
        boolean result=evenNumber(num);
        System.out.println(result);

        int num1=24;
        boolean result1=oddNumber(num1);
        System.out.println(result1);

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
}
