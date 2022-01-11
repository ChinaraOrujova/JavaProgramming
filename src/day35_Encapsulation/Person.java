package day35_Encapsulation;

public class Person {

    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;

    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    static{
        planet="Earth";
        isHuman=true;
        hasNose=true;
        numberOfHead=1;
        numberOfWings=0;

    }

    public static void printPlanetName(){
        System.out.println("planet: "+ planet);
    }
    public void eat(){
        System.out.println(name+" is eating food");
    }
    public void drink(){
        System.out.println(name+ " is drinking");

    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", planet=" + planet +
                ", language='" + language + '\'' +
                '}';
    }
}
