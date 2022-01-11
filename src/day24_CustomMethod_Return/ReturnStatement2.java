package day24_CustomMethod_Return;

public class ReturnStatement2 {
    public static void main(String[] args) {
month(9);
    }

    public static void month(int number) {
        String month = "";
        if (number < 1 || number > 12) {
            System.out.println("Invalid");
            return;//exits month method, remaining code fragments of the method never get executed
        }

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
        System.out.println(month);
    }

    }

