package day39_Recap.Shape;

public class ShapeObject {
    public static void main(String[] args) {
        Square square = new Square(10);

        System.out.println(square);

        square.setSide(15);
        System.out.println(square);


        Rectangle rectangle = new Rectangle(12,5);
        System.out.println(rectangle);

        rectangle.setWidth(8);
        System.out.println(rectangle);

        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getName());

        Circle circle = new Circle(15);
        System.out.println(circle);

        circle.setRadius(18);
        System.out.println(circle);
    }


}
