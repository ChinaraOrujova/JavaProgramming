package Day21_ForEachLoop;

import java.util.Arrays;

public class ArrayUtility {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5};
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));

        String str ="Java";
        System.out.println(str);
        System.out.println(str.toString());
        System.out.println("---------------------------");

        int[] scores ={95,100,55,65,85,78};
        System.out.println(Arrays.toString(scores));

        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        System.out.println("min number: "+scores[0]);
        System.out.println("max number: "+scores[scores.length-1]);

        String[] names ={"Gunay","Anna","Zuhal","Ahmet","Maria","Sinem"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println("-----------------------------");
        String[] name ={"ANNA","anna"};
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));

        System.out.println("--------------------------------");
        int[] arr1 ={1,3,2};
        int[] arr2 ={1,2,3};

        boolean r1=Arrays.equals(arr1,arr2);
        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(args);
        boolean r2 =Arrays.equals(arr1,arr2);
        System.out.println(r2);

        char[] ch1 ={'a','b','c'};
        char[] ch2 ={'b','a','c'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram =Arrays.equals(ch1,ch2);
        System.out.println("anagram = "+anagram);


    }
}
