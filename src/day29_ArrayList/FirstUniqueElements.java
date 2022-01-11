package day29_ArrayList;

import java.util.ArrayList;

public class FirstUniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);



        for (Integer each : list) {
            int count=0;
            for (Integer eachNum : list) {
                if (each == eachNum) {
                    count++;
                }
            }
                if(count==1){
                    System.out.println(each);
                    break;//it will give us only first unique element
                }

            }

        }

    }

