package replit;


import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>(Arrays.asList("Apple","Grape","Lemon"));
        int a=list.size();
        int b=list.indexOf("Grape");
        System.out.println(a+b);



    }
}







