package day33_Statics;

public class IPhone2 {

    public  String model;
    public double price;
    public String color;
    public String size;

    public static String brand="Apple";
    public static String OS ="IOS";
    public static String madeIn="China";

    public IPhone2(String model, double price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public void faceTime(){

    }
}
