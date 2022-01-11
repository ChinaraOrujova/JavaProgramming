package day14_String;

public class StringMethod3_Substring {

    public static void main(String[] args) {

        String str1 = "Java is fun, Java is cool";
        //String s1 = str1.substring(0,10+1); //Java is fun

        int beg = str1.indexOf("J");

        int end = str1.lastIndexOf(",");
        String s1 = str1.substring(beg,end);

        String s2 = str1.substring( str1.lastIndexOf("J"));
        System.out.println(s1);
        System.out.println(s2);




    }
}
