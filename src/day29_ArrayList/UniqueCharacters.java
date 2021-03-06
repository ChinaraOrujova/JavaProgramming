package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str="aaabcccdeeef";
        String[] array =str.split("");
        ArrayList<String> list=new ArrayList<>(Arrays.asList(array));

        ArrayList<String> unique =new ArrayList<>(list);

        unique.removeIf(p-> Collections.frequency(list,p)>1);
        System.out.println(unique);

        System.out.println("--------------------------");
        String unique1="";
        for (String each : list) {
           int frequency= Collections.frequency(list,each);
           if(frequency==1){
               unique1+=each;
           }

        }
        System.out.println("Unique: "+unique1);
    }
}
