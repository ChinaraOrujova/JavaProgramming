package day34_GarbageCollection_AccessModifier;

public class CydeoStudent {
    public String name;
    public static String schoolName;

    public CydeoStudent( String name){
        this.name=name;
    }
    static {
        schoolName="Cydeo School";
    }

}
 class CydeoStudentObject{
    public static void main(String[] main){
        CydeoStudent student1=new CydeoStudent("Jimmy");
        CydeoStudent student2=new CydeoStudent("Joe");

        System.out.println(CydeoStudent.schoolName);
    }


 }