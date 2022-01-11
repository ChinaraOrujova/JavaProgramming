package day09_IfStatements;

    public class GradeReport {

        public static void main(String[] args) {

            String name ="Jasmine";
            int score = 90;
            char grade;

        /*
        score:
        90 ~ 100 ==> A
        80 ~ 89 ==> B
        70  ~ 79 ==> C
        60 ~ 69 ==>D
        0~59 ==> F

         */

            if(score>=90 && score <=100) {
                grade = 'A';
            } //if the student made A

            else if ( score>=80 && score < 90) {
                grade = 'B';
            } //if the student made B

            else if(score >= 70 && score <80) {
                grade = 'C';
            } //if the student made C

            else if(score >= 60 && score <70) {
                grade = 'D';
            } //if the student made D

            else  {
                grade = 'F';
            } //if the student made F

            System.out.println( name + " grade is: " + grade );

        }
    }


