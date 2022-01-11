package day33_Statics;

public class iPhone {

    public  String model;
    public double price;
    public String color;
    public String size;

    public static String brand;
    public static String OS ="IOS";
    public static String madeIn="China";
    public static boolean hasBattery=true;
    public static boolean isTouchScreen=true;
    public static boolean hasFaceTime=true;

    /*public void printModelAndPrice(){
        System.out.println(model+ " : "+price);
        System.out.println(OS);

     */

    public static void printOS(){
        System.out.println(OS);
    }

}
