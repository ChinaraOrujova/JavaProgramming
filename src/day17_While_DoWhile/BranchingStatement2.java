package day17_While_DoWhile;

public class BranchingStatement2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {
            if (i == 'C') {
                continue;
            }
            System.out.print(i);
        }

        System.out.println("-----------------------------");
//print all even number 1~10


        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;//skip

            }
            System.out.println(i);

        }
        System.out.println("------------------------------");

        //print all odd number between 1~10
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

    }
}
