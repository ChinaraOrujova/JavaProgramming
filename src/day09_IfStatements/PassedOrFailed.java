package day09_IfStatements;

public class PassedOrFailed {
    public static void main(String[] args) {
        int score = 75;

        boolean isPassed = score >= 60;
        boolean isFailed = score < 60;

        if (isPassed) {
            System.out.println("Congrats, you passed");
        } else  {

            System.out.println("Failed");
        }
    }
}
