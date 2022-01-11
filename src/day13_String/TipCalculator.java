package day13_String;

import java.util.Locale;
import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Split or No split");
        String yesOrNo = scan.next().toLowerCase();

        System.out.println("Enter the number of the people entered");
        int numberOfPeople = scan.nextInt();

        System.out.println("Enter the check amount");
        Double check = scan.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String quality = scan.next();

        double tipRate = (quality.equals("Excellent"))?0.25:(quality.equals("Great"))?0.20:(quality.equals("Good"))?0.15:(quality.equals("Fair"))? 0.10: 0.05;
        double tipAmount = tipRate * check;

        double totalPerPerson = check/numberOfPeople;
        double totalTipPerPerson =  totalPerPerson * tipRate ;

        System.out.println("Number of people entered: "+ numberOfPeople);
        System.out.println("Total to pay: " + check);
        System.out.println("Total tip: " + tipAmount);

        if (yesOrNo.equals("yes")){
            System.out.println("Total per person: " + totalPerPerson);
            System.out.println("Tip per person: "+ totalTipPerPerson);
        }

        scan.close();


    }
}
