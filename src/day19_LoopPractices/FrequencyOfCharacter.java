package day19_LoopPractices;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "aabcccd";
        String result ="";


        for (int j = 0; j < str.length(); j++) {
            char ch =str.charAt(j);
            int countChar = 0;


        for (int i = 0; i < str.length(); i++) {//find the frequency of each character
            char eachCh = str.charAt(i);//each character of str
            if (ch == eachCh) {
                countChar++;
            }
        }
        if(result.contains(ch+"")){
            continue;
        }
        result+=ch;
        result+=countChar;
        }
        System.out.println(result);
    }
}
