package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {
        /*

2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 53, b= 76, c = 94;

            Output:
                15 is the median number
         */

        int a =53, b=76, c =94;

        boolean aIsMedian = (b > a && c <a) || (b<a && c>a);

        /*in order for a to be the median number:

        1) if c is the maximum number & b is the munimum number, then a is the  median number
        2) if b is the maximum number & c is the minimum number, then a is the median number
         */
        boolean bIsMedian = (a> b && c< b) ||(a<b && c>b);
        boolean cIsMedian = (b>c && a<c) ||(b<c && a>c);//!aIsMedian && !bIsMedian;

        if (aIsMedian){ //if a is the median number
            System.out.println(a + " is medium number");
        }
        if (bIsMedian){ // if b is median number
            System.out.println(b + " is medium number");
        }
        if (cIsMedian){ //if c is median number
            System.out.println(c + " is medium number");
        }

    }
}
