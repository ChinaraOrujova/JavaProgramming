package day39_Recap.Shape;

public class Square extends Shape{

    private double side;

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        if(side<=0){
            System.out.println("Invalid side");
            System.exit(1);
        }

        this.side=side;

    }

    public Square( double side) {
        super("Square");
        setSide(side);
    }

    public double area(){
        return side*side;

    }
    public double perimeter(){
        return side*4;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}