package day34_GarbageCollection_AccessModifier;

import java.util.ArrayList;
import java.util.Arrays;

public class Circle {
    public double radius;
    public static double pi;
    public static String name;

    public static ArrayList<Integer> numbers;

    public Circle(double radius){
        this.radius=radius;
    }
      static {
        pi=3.14;
        name="Circle";

        numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5));
    }



    /*public static void main(String[] args) {
        pi=3.14;
        name="Circle";
        numbers=new ArrayList<>();
        numbers.add(10);
        System.out.println("pi "+ pi);
        System.out.println("name "+name);
        System.out.println("numbers "+numbers);
    }

     */
}

