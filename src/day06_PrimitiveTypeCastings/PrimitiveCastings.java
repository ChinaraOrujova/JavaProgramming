package day06_PrimitiveTypeCastings;

import javax.sound.midi.Soundbank;

public class PrimitiveCastings {

    public static void main(String[] args) {
         byte a = 100;
         short b = a;

         //short b = (short)a; it is done automatically
         //(short) a

        long j = 1000000;
        short k = (short) j;
        System.out.println(j + ":" + k);

        double l = 2.5;
        float m  = (float)l;

        System.out.println(l + ":" + m);

        double n = 10.8;
        int s = (int) n;

        System.out.println( n + ":" + s);

        int c =  b; //implicit casting
        // int c = (int)b

        long d = c;
        // long d = (long)c

        float e = d;
        double f = e;

        System.out.println("----------------------------");

        int a1 =100;
        byte b1 = (byte) a1;

        int x = 55;
        short y = (short) x; //explicit casting

        System.out.println(x + ":" + y);

        System.out.println("-------------------------");

        double d1 = 20.5;
        short s1 = (short) d1;

        float f1 = 30.5F;
        long L1 = (long) f1;


    }
}
