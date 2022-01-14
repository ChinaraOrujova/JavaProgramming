package day39_Recap.Shape;

public class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        if(name==null){
            System.out.println("name can not be null");
            System.exit(1);
        }
        if(name.isEmpty()){
            System.out.println("Invalid name");
            System.exit(1);
        }
    }
    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
