package day08_IfStatement;

public class GradeReport {

    public static void main(String[] args) {

        int score = 85;

       /*
        System.out.println(true == !false);//true

        System.out.println(true != false);//false
        System.out.println(!false == true);//true

        */

        /*
        score:
        90 ~ 100 ==> Excellent
        80 ~ 89 ==> Great
        70  ~ 79 ==> Good
        60 ~ 69 ==>Passed
        0~59 ==> Failed

         */
        boolean a = score>=90 && score <= 100;
        boolean b = score>=80 && score <=89;//score >=80 && !a
        boolean c = score >=70 && score <=79; //score >= 70 && score <=79
        boolean d = score >=60 && score <=69;
        boolean f =!a && !b && !c && !d;

        if(a) {
            System.out.println("Excellent");
        } //if the student made A

        if(b) {
            System.out.println("Great");
        } //if the student made B

        if(c) {
            System.out.println("Good");
        } //if the student made C

        if(d) {
            System.out.println("Passed");
        } //if the student made D

        if(f) {
            System.out.println("Failed");
        } ////if the student made F

    }
}
