package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args){

        // age: 38 years old

        byte age =38;

        //weight: 160 pound

        //  byte weight = 160; 160 is out of byte range

        short weight = 160; // 160 is within the range of short

        //salary: 100000 $

       // short salary = 100000; // 100000 is out of short' range
        int salary = 100_000;// int is the preferred data type of integer data type
        //int asset = 3_333_333_333;// 3_333_333_333 is out of int range

        long asset = 3_333_333_333L; //in order to force the compiler to take the data type as long you need to put upper or lower case l at the end of number

        //tax: 0.26
        float tax = 0.26F;

        double PI = 3.14;
    }
}
