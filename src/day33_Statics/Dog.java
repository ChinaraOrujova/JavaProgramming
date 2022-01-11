package day33_Statics;

public class Dog {

    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public static int numberOfLegs=4, numberOfEyes=2, numberOfWings=0;
    public static boolean isFriendly=true;

    public Dog(String breed, int age, char gender, String size, String color) {
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.size = size;
        this.color = color;
    }

    public void eat(){
        System.out.println(breed+" is eating");
    }
    public void sleep(){
        System.out.println(breed+ " is sleeping");
    }
    public void play(){
        System.out.println(breed+ " is playing");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
