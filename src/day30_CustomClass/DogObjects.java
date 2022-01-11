package day30_CustomClass;

import java.util.ArrayList;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.name="Lucy";
        dog1.breed="Husky";
        dog1.age=5;
        dog1.gender='F';
        dog1.size="Small";
        dog1.color="White";

        Dog dog2=new Dog();
        dog2.name="Ace";
        dog2.breed="Husky";
        dog2.age=5;
        dog2.gender='M';
        dog2.size="Large";
        dog2.color="White & Gray";

        Dog dog3=new Dog();
        dog3.setInfo("Jack","German Shepard",2,'M',"Large","Black");

        Dog dog4=new Dog();
        dog4.setInfo("Max","Maltese",3,'M',"Small","White");

        Dog dog5= new Dog();
        dog5.setInfo("Sully","Pit-Bull",6,'M',"Large","Black");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
        System.out.println(dog5);

        System.out.println("---------------------------------------");
        Dog[] dogs ={dog1,dog2,dog3,dog4,dog5};


        ArrayList<Dog> femaleDogs=new ArrayList<>();
        ArrayList<Dog> maleDogs =new ArrayList<>();

        for (Dog each : dogs) {
            if (each.gender == 'M'){
                maleDogs.add(each);
            }else {
                femaleDogs.add(each);
            }
        }

        System.out.println("--------------------------");

        femaleDogs.removeIf(p -> p.gender == 'M');
        maleDogs.removeIf(p -> p.gender == 'F');



        dog1.eat();
        dog2.bark();

    }

}

