package day23_CustomMethod_Void;

public class CustomMethodWithParameters {
    public static void main(String[] args) {
        oddOrEven(3);//the method demand additional info to complete its task
        ageOfPerson(1989);
        printNumbers(100,120);
    }
    //create a function that can check is o number is odd number or even number
    public static void oddOrEven(int number){
        if(number%2==0){
            System.out.println(number +" is even number");
        }else{
            System.out.println(number +" is odd number");
        }
    }
    //create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){
      int currentYear=2021;
      int age=currentYear-birthYear;
        System.out.println("Your age is " +age);
    }
    //create a function that can print all the numbers between X and Y
    public static void printNumbers(int x,int y){
        for (int i = x+1; i <y ; i++) {
            System.out.println(i);

        }
    }
}
