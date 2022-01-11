package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        String[] group1={"Jon","Joes","James"};
        String[] group2={"Chinara","Heydar","Jason"};
        String[] group3={"Ulya","Zulya","Jasmine"};


        String[][]groups=new String[3][];//index: 0,1,2
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;

        System.out.println(Arrays.toString(groups));//toString() is for one dimensional array
        System.out.println(Arrays.deepToString(groups));

        System.out.println("===================================");

        String[][] groups1={{"Jon","Joes","James"},{"Chinara","Heydar","Jason"},{"Ulya","Zulya","Jasmine"}};
        int[][] arr2d ={{10,11,13,14},{1,2,3,4,5,},{23,24,25,26,27}};
        System.out.println(Arrays.deepToString(arr2d));
        System.out.println(Arrays.toString(arr2d[1]));
        System.out.println(arr2d[2][2]);




    }
}
/*
String[] group1={"Jon","Joes","James"};
String[] group2={"Chinara","Heydar","Jason"}
String[] group3={"Ulya","Zulya","Jasmine"};
 */