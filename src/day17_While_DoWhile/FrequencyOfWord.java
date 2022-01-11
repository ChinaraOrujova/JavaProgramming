package day17_While_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String sentence = "JavaJavaJava";
        int frequency=0;

                       // i< sentence.length()-3
        /*for (int i = 0; i <= sentence.length()-4; i++) {// index numbers are 0,1,2,3
            String eachSub = sentence.substring(i,i+4);
            if (eachSub.equals("Java")) {

                frequency++;

         */
        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.contains("Java")) {
                sentence = sentence.replaceFirst("Java", "");
                frequency++;

            }

        }
        System.out.println(frequency);
    }
}
