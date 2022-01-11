package day20_Array;

import java.util.Arrays;

public class AlphabetReverse {
    public static void main(String[] args) {
        char[]letter =new char[26];

      /*  for (int i = 0, j ='Z'; i <letter.length&& j>='A' ; i++,j--) {
            letter[i]= (char) j;
        }

       */

        char ch='Z';
        for (int i = 0; i < letter.length; i++) {
            letter[i]=ch;
            ch--;

        }
        System.out.println(Arrays.toString(letter));
    }
}
