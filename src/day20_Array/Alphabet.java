package day20_Array;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        char[] letters = new char[26];

      /*  letters[0] ='Z';
        letters[1] ='Y';
        letters[2] ='X';
        char ch='Z';
        for (int i = 0; i <letters.length; i++) {
            letters[i]=ch--;

       */
        for (int i = 0,j='Z'; i <letters.length ; i++,j--) {
            letters[i]= (char)j;

        }
        System.out.println(Arrays.toString(letters));//it is the whole array
        System.out.println(letters[0]);//it prints the element of array

        }

    }

