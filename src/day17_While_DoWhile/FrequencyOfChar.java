package day17_While_DoWhile;

public class FrequencyOfChar {

    public static void main(String[] args) {
        String str = "AAABBC";
        char ch = 'A';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {//indexes of string
            char eachChar = str.charAt(i);//each character of str
            if (eachChar == ch) { //if given ch is matching with eachChar, then ch is appeared in the string
                count++;
            }

        }
        System.out.println(count);
    }
}
