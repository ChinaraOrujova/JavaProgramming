package OfficeHours;

public class SumOfEven {
    public static void main(String[] args) {

                int sumOfEven=0;
                int sumOfOdd=0;
                int num=0;
                do {
                    if (num % 2 == 0) {
                        sumOfEven += num;
                    } else {
                        sumOfOdd += num;
                    }
                    num++;
                }
                while (num <= 10);

                System.out.println("Sum of the even numbers are "+sumOfEven);
                System.out.println("Sum of the odd numbers are "+sumOfOdd);
            }
        }






