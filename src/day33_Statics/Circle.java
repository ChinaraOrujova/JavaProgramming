package day33_Statics;

public class Circle {
    public double radius, diameter;
    public static double pi=3.14;

    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = radius*2;
    }
    public double calcArea(){
        double area=radius*radius*pi;
        return area;
    }
    public double calcPerimeter(){
        double perimeter=2*pi*radius;
        return perimeter;
    }
    public static double printPI(){
        return pi;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + printPI() +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
