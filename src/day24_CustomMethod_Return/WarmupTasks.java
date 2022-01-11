package day24_CustomMethod_Return;

public class WarmupTasks {
    public static void main(String[] args) {
        initials("Chinara", "Orujova");
        domainOfEmail("china.orujova@gmail.com");
        month(3);
        daysOfTheWeek(7);
        daysOfTheMonth(12);

    }
    public static void initials(String firstName, String lastName){
       String initials =firstName.charAt(0)+"."+lastName.charAt(0);
       initials=initials.toUpperCase();
        System.out.println("Initials: "+initials);
        System.out.println("--------------------------------");
    }
    public static void domainOfEmail(String email){
        String domain= email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println(domain);
        System.out.println("-------------------------------------------");
    }

    public static void month(int number){
        String month = "";

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
        System.out.println("-------------------------------------------");
    }
    public static void daysOfTheWeek(int number){
        String daysOfTheWeek= (number>0&&number<8)?(number==1)?"Monday":(number==2)?"Tuesday":(number==3)?"Wednesday":
                (number==4)?"Thursday":(number==5)?"Friday":(number==6)?"Saturday":"Sunday":"Invalid number";;
        System.out.println(daysOfTheWeek);
        System.out.println("----------------------------------------");

    }
    public static void daysOfTheMonth(int month) {

        if (month > 0 && month < 13) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println("31 days");
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("30 days");
            } else {
                System.out.println("28 days");
            }

        } else {
            System.out.println("Invalid number");
        }

    }


}
/*
1. Create a method that can display the initials of the person

2. Create a method that can display the domain of the email

3. Create a method that can display the name of the month based on the given number to the method

4. Create a method that can print the name of the day based on the given number to the method

5. Create a method that can print how many days a month has

 */