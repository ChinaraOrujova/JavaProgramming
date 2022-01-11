package day31_Constructors;

public class PersonObject {
    public static void main(String[] args) {

        Person person1=new Person("Chinara",'F',32);

        Person person2= new Person("Daniel",'F',28);

        Person person3= new Person("Heydar",'M',36);

        person2.name="Muhtar";


        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
