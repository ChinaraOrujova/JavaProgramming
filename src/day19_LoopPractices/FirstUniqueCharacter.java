package day19_LoopPractices;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        // Write a program that can return the index number of the first unique character.

        String str ="aaabbcde";
        int result =0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count =0;
            for (int j = 0; j <str.length() ; j++) {
                char each = str.charAt(j);
                if(ch==each){
                    result=str.indexOf(str.charAt(i));
                    count++;
                }
            }
            if(count==1){
                break;
            }
        }
        System.out.println(result);


    }
}
