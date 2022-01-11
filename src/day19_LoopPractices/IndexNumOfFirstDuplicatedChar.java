package day19_LoopPractices;

public class IndexNumOfFirstDuplicatedChar {

    public static void main(String[] args) {
        String str ="bccdeeegg";
        int result =0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if (ch == each) {
                    result =str.indexOf(str.charAt(i));
                    count++;
                }
            }

                if (count == 2) {
                    break;

            }
        }
        System.out.println("The first index of duplicated is: "+result);
    }
}
