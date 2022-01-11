package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray2 {
    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7,8 }, {9, 10, 11, 12,13}};

        for (int i = arr2D.length - 1; i >= 0; i--) {//i: index number of 2D arrays starting from last index to 0
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j]+" ");//j: index number of elements starting from 0 to last index
            }
            System.out.println();

        }

        System.out.println("================================================");

        for (int i = 0; i < arr2D.length; i++) {
            for (int i1 = arr2D[i].length - 1; i1 >= 0; i1--) {
                System.out.print(arr2D[i][i1]+ " ");
            }
            System.out.println();
        }

        System.out.println("================================================");

        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int i1 = arr2D[i].length - 1; i1 >= 0; i1--) {
                System.out.print(arr2D[i][i1]+ " ");

            }
            System.out.println();
        }

    }
}
