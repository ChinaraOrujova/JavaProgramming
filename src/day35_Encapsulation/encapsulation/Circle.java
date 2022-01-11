package day35_Encapsulation.encapsulation;

public class Circle {
    private double radius;
    public static double pi=3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        if(radius<=0){
            System.out.println("Invalid number");
            return;
        }
        this.radius=radius;
    }
    public double calcArea(){
        double area=radius*radius*pi;
        return area;
    }
    public double calcPerimeter(){
        double perimeter=2*pi*radius;
        return perimeter;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area of circle=" + calcArea() +
                "perimeter of circle=" + calcPerimeter() +
                '}';
    }
}
