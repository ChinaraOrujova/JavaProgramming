package day37_Inheritance.Phone;

public class Nokia extends Phone{
    public Nokia(String model, String size, int price, String color) {
        super("Nokia", model, size, price, color);


    }
    public void selfDefense() {
        System.out.println(brand + " can be used for self defensing");
    }
}
