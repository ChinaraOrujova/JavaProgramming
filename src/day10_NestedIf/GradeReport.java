package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {
        /*
        90~100: excellent
        80~89: Great
        70~79: Good
        60~69: Passed
        0~59: Failed
         */
         int grade = 10;

         if (grade<=100 && grade >=0){//if the score is valid there are 5 possibilities
             if(grade >=90){//false:score<90
                 System.out.println("Excellent");
             }else if (grade>=80){ //fails: score <80
                 System.out.println("Great");
             }else if (grade>=70){//fails: score <70
                 System.out.println("Good");
             }else if (grade>=60 ){//fail: score<60
                 System.out.println("Passed");
             }else{
                 System.out.println("Failed");
             }

         }
         else{
             System.out.println("Invalid number");

         }
    }
}
