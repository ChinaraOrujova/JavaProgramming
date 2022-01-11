package day33_Statics;

public class CarObject {
    public static void main(String[] args) {

        Car car1= new Car("Toyota","Highlander","white",2016,45000);
        System.out.println(Car.numberOfWheels);
        System.out.println(car1.make);
    }
}
