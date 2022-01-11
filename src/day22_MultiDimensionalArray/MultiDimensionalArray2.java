package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {

        int[][][] arr3D={{{1, 2, 3}, {4, 5, 6, 7,8 }, {9, 10, 11, 12,13}},    {{1, 2, 3}, {4, 5, 6, 7,8 }, {9, 10, 11, 12,13}}};

        System.out.println(Arrays.deepToString(arr3D));
        System.out.println(Arrays.deepToString(arr3D[1]));
        System.out.println(Arrays.toString(arr3D[1][1]));
        System.out.println(arr3D[1][1][1]);
        System.out.println("--------------------------------------------");
        for(int[][]each2DArray:arr3D){
            for(int[]each1DArray:each2DArray){
                for(int eachElement:each1DArray){
                    System.out.print(eachElement + " ");
                }
                System.out.println();

            }

        }

        System.out.println("===============================================");
       int[][][][] numbers={{{{1, 2, 3}, {4, 5, 6, 7,8 }, {9, 10, 11, 12,13}},  {{1, 2, 3}, {4, 5, 6, 7,8 }, {9, 10, 11, 12,13}}, {{1, 2, 3}, {4, 5, 6, 7,8 }, {9, 10, 11, 12,13}}}};
        for(int[][][]each3D:numbers){
            for (int[][] each2D:each3D){
                for(int[] each1D:each2D){
                    for (int each:each1D){
                        System.out.print(each+ " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
