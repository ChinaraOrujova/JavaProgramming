package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveZerosToTheEnd {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        int frequency= Collections.frequency(list,0);
        list.removeIf(p->p==0);
        System.out.println(list);
        System.out.println(frequency);

        for (int i = 0; i < frequency; i++) {
            list.add(0);


        }
        System.out.println(list);

        System.out.println("------------------------------");

        int size= list.size();

        list.removeAll(Arrays.asList(0));
        System.out.println(list);

        int newSize= list.size();
        int totalNumberOfZeros=size-newSize;
        System.out.println("total number of zeros: "+totalNumberOfZeros);
        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }
        System.out.println(list);

        System.out.println("------------------------------------");

        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result =new ArrayList<>();
        for (Integer each : list2) {
            if(each!=0){
                result.add(each);

            }

        }
        for (Integer eachCh : list2) {
            if(eachCh==0){
                result.add(eachCh);
            }

        }
        System.out.println("result: "+result);

    }
}
