package day10_NestedIf;

public class NameOfMonth2 {

    public static void main(String[] args) {
        int number = 2;
        /*
        if (number <= 12 && number >= 1) {//if the number is valid (1~12) PRE-CONDITION
            if (number == 1) {
                month = "January";
            } else if (number == 2) {
                month = "February";
            } else if (number == 3) {
                month = "March";
            } else if (number == 4) {
                month = "April";
            } else if (number == 5) {
                month = "May";
            } else if (number == 6) {
                month = "June";
            } else if (number == 7) {
                month = "July";
            } else if (number == 8) {
                month = "August";
            } else if (number == 9) {
                month = "September";
            } else if (number == 10) {
                month = "October";
            } else if (number == 11) {
                month = "November";
            } else {
                month = "December";
            }
        } else {
            System.out.println("Invalid Number");
        }
        System.out.println(month);
         */

        String months=(number==1)?"January":(number==2)?"February":(number==3)?"March":(number==4)?"April"
                :(number==5)?"May":(number==6)?"June":(number==7)?"July":(number==8)?"August"// we can give it without printises
                :(number==9)?"September":(number==10)?"October":(number==11)?"November":"December";
        System.out.println(months); //total number of question mark should be same as double dots
    }
}
