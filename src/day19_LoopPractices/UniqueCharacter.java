package day19_LoopPractices;

public class UniqueCharacter {

    public static void main(String[] args) {
        String str = "aabccdeef";
        String result = "";


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);

            int count = 0;//represent the frequency of the char

            for (int i = 0; i < str.length(); i++) {//compare the character that outer picked, with each character of strter
                char each = str.charAt(i);
                if (ch == each) {
                    count++;
                }
            }
            //if(count!=1){
            //continue;}
           if(count==1){//if the frequency of the character is one then the character is unique
               result+=ch;
           }
        }
        System.out.println(result);
    }
}
