package Day21_ForEachLoop;

public class MaxNumber {
    public static void main(String[] args) {
         int[] numbers ={10,5,4,20,1,0};
         int max =numbers[0];
         for(int eachElement:numbers){
             if (eachElement>max){
                 max =eachElement;

             }
         }
        System.out.println(max);

        System.out.println("--------------------------");
        int[] numbers2 ={10,5,4,20,1,0};
        int min =numbers[0];

        for (int i : numbers2) {
            if(i<min){
                min=i;
            }

        }
        System.out.println(min);


    }
}
