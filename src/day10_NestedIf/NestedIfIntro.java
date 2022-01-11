package day10_NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {
         int score = 950;


         if(score>=0 && score <= 100){ //if the score is valid

             if(score>=60){
                 System.out.println("Passed"); //if the student passed the exam
             }
             else{
                 System.out.println("Failed"); //it the student failed exam
             }

         }
         else { //if the score is not valid
             System.out.println("invalid score");

         }

    }
}

