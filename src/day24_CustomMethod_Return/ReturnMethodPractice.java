package day24_CustomMethod_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {
       int maxNumber= max(100,200);
        System.out.println("Max number is: "+maxNumber);

       int multiplyBy2=maxNumber*2;
        System.out.println(multiplyBy2);

    }
    public static int max(int a, int b) {
        int result=0;
        if(a>b){
            result=a;
        }else{
            result=b;
        }
        return result;
    }

}
//find the max number between 100 & 200
//multiply the max number 2