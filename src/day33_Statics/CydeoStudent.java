package day33_Statics;

public class CydeoStudent {
    public String name;
    public int age;
    public char gender;
    public int ID;
    public char grade;
    public int batchNumber;
    public int groupNumber;

    public static String schoolName="Cydeo";
    public static String programmingLanguage="Java";

    public CydeoStudent(String name, int age, char gender, int ID, char grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID = ID;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }
    public void study(){
        System.out.println(name+" is studing");
    }
    public void attendClass(){
        System.out.println(name+ " is attending in the class");
    }
    public static void printSchoolName(){
        System.out.println(schoolName);
    }
    public static void printProgLanguage(){
        System.out.println(programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", ID=" + ID +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
