package day40;

public class FinalVariable {
    final String birthday;
    final static String name;
    static{
        name="Batch 25";
    }

    public FinalVariable(String birthday) {
        this.birthday=birthday;
    }

    public static void main(String[] args) {




         final double pi = 3.14;

         //pi= 4.14; final variable can not be reassigned

        final String name;
        name="Java";
        System.out.println(name);

        System.out.println("---------------------------------");

        FinalVariable obj= new FinalVariable("September/08");

        //obj.birthday= "june/01"; final variable can not be reassigned
        System.out.println(obj.birthday);



        System.out.println(FinalVariable.name);
    }
}
