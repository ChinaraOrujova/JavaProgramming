package day19_LoopPractices;

public class CharAppaeredTwice {
    public static void main(String[] args) {

        //Write a program that can display all the characters that appeared twice in the string.
        String str = "bbasccwwerr";
        String result="";

        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if(ch==each){
                    count++;
                }
                }
            if(count==2){
                result+=ch;

            }

        }
        System.out.println(result);
    }
}
