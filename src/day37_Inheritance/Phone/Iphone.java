package day37_Inheritance.Phone;

public final class Iphone extends Phone{


    public Iphone(String model, String size, int price, String color) {
        super("Apple", model, size, price, color);
    }

    public final void faceTime(long phoneNumber){
        System.out.println("Facetime with number: "+phoneNumber);
    }
    public void faceTime(String email) {
        System.out.println("Facetime with email: " + email);
    }
}
