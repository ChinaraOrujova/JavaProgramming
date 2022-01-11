package day18_NestedLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {
        int num1 =20;
        int num2 = 6;
        int count=0;

         while(num1>=num2){
             num1-=num2;
             count++;
         }
        System.out.println("The division result is: "+count+" with remainder of "+num1);
    }
}
