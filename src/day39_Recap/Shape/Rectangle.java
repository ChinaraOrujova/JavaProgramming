package day39_Recap.Shape;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public double getLength(){
        return length;

    }
    public double getWidth(){
        return width;
    }

    public void setLength(double length){
        if(length<=0){
            System.out.println("invalid length: "+length);
            System.exit(1);
        }
        this.length=length;
    }

    public void setWidth(double width){
        if (width<=0){
            System.out.println("Invalid width: "+width);
            System.exit(1);
        }
        this.width=width;
    }


    public double area(){
        return width*length;

    }

    public double perimeter(){
        return 4*(width+length);
    }

    public Rectangle( double length, double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
