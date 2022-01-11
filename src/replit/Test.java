package replit;
import day29_ArrayList.ReverseArrayVsArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;


public class Test {
    public static void main(String[] args) {
        String [] cities ={"Boston","Houston","Austin","lincoln","Tusla"};
        ArrayList<String> list =new ArrayList<>(Arrays.asList(cities));
        int a= list.size();

        for(String str:list){
            String rev="";
            for(int i=str.length()-1;i>=0;i--){
                rev+=str.charAt(i);
            }
            list.set(--a,rev);
        }
        System.out.println(list);

    }
}







