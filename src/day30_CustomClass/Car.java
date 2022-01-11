package day30_CustomClass;

import javax.xml.namespace.QName;

public class Car {

    public String brand;
    public String model;
    public String color;
    public int year;
    public int price;

    public void setInfo(String carBrand,String carModel, String carColor,int carYear, int carPrice){
        brand=carBrand;
        model=carModel;
        color=carColor;
        year=carYear;
        price=carPrice;

    }
    public void drive(){
        System.out.println(brand +" "+ model+" is driving");
    }
    public void start(){
        System.out.println(brand +" "+ model+" is start the engine");
    }
    public void stop(){
        System.out.println(brand +" "+ model+" is stopped driving");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

}
/*
attributes:
brand, model, color, year, price

Actions:
drive(),start(), stop(), toString(), setInfo()

create 3 objects of car;
 */