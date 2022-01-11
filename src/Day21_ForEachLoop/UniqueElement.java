package Day21_ForEachLoop;

public class UniqueElement {
    public static void main(String[] args) {

        String[] words = {"Layan", "Layan", "Chinara", "Adam", "Adam", "Muhtar", "Muhtar"};


        for (String each : words) {

            int frequency = 0;
            for (String element : words) {
                if (element.equals(each)) {
                    frequency++;
                }
            }
            if(frequency==1){
                System.out.println(each);
            }
        }
    }
}
