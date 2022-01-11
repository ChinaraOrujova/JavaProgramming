package day36_Inheritance.Animal;

public class Zoo {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.setInfo("max","husky",'M',2,"small","white");
        dog1.eat();
        dog1.drink();
        dog1.sleep();
        dog1.move();
        dog1.bark();

        Cat cat1=new Cat();
        cat1.setInfo("Tarcin","British",'M',2,"Small","brown");
        cat1.eat();
        cat1.drink();
        cat1.sleep();
        cat1.move();
        cat1.meow();

        Tiger tiger1=new Tiger();
        tiger1.setInfo("Sher Khan","Bengal",'M',3,"Large","Orange");
        tiger1.eat();
        tiger1.drink();
        tiger1.sleep();
        tiger1.move();
        tiger1.hunt();
        tiger1.roar();



    }
}
