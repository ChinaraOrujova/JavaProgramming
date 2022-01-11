package day09_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        int age = 13;
        String citizen = "USA";

        //boolen isEligible = age > 18 && citizen =="USA

        if (age > 18 && citizen=="USA"){
            System.out.println("The person is eligible to vote");
        }
        else{
            System.out.println("The person is not eligible to vote");
        }
    }
}
