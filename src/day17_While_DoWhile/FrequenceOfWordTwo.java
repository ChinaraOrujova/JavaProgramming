package day17_While_DoWhile;

import java.io.StringReader;

public class FrequenceOfWordTwo {
    public static void main(String[] args) {
        String str ="Cat Cat Dog Dog";
        int frequency=0;

        // i< sentence.length()-3
        for (int i = 0; i <= str.length()-3; i++) {// index numbers are 0,1,2,3//to prevent run over bond
            String eachSub = str.substring(i,i+3);
            if (eachSub.equalsIgnoreCase("Cat")) {

                frequency++;
            }

        }
        System.out.println(frequency);
    }
}

