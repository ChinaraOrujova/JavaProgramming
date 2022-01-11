package day11_Switch_Scanner;

public class NumberOfDays {

    public static void main(String[] args) {
        int year =2000;
        int month = 5;
        String days = "";

        if (month >= 1 && month <= 12) {

            switch (month) {
                case 2:
                    days =(year % 4 ==0)?"29 days":"28 days";
                   /* if(year%4==0){
                        days ="29 days";
                    }else{
                        days = "28 days";
                    }
                    */
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = "30 days";
                    break;
                default: //1,3,5,7,8,10,12
                    days = "31 days";
                    break;
            }

            System.out.println(days);
        } else {
            days = "Invalid number";
        }
    }
}
