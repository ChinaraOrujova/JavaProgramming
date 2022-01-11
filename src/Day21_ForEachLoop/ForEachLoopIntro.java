package Day21_ForEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {

        int[] numbers ={10,20,30,40,50,60,70,80,90,100};

        for (int i = 0; i < numbers.length; i++) {//indexes of the array
            int eachElement = numbers[i];
            System.out.println(eachElement);

        }
        System.out.println("--------------------------------");
        for(int eachElement:numbers){// elememt of the arrat
            System.out.println(eachElement);
        }

    }
}
