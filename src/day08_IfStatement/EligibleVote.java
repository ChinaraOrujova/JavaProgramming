package day08_IfStatement;

public class EligibleVote {

    public static void main(String[] args) {
         String name = "Josh";
         int age = 38;
         String citizen = "USA";

         boolean isEligible = age>=21 &&citizen=="USA";
         boolean isNotEligible =!isEligible;

         //eligible
        if(isEligible){
            System.out.println("Eligible");
        }



        //not eligible
        if(!isEligible){ //!True ==> not true==>False
            System.out.println("Not Eligible");
        }
    }
}
