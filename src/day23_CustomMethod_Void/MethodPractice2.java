package day23_CustomMethod_Void;

public class MethodPractice2 {
    public static void main(String[] args) {
        helloWorld5Times();
        System.out.println("--------------------------------");
        helloCydeo5Times();
        System.out.println("--------------------------------");
        evenNumbers();

    }

    //create a function that can print hello world 5 times
    //create a function that can print hello cydeo 5 times
    public static void helloWorld5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");

        }

    }


    public static void helloCydeo5Times() {
       for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");
        }



    }

    //create a function that can print all the even numbers from 1 to 10

    public static void evenNumbers(){
        for (int i = 1; i <=10; i+=2) {
                System.out.println(i+" ");

            }

        }
    }

