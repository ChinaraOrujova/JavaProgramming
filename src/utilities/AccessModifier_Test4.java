package utilities;

import day40.ProtectedAccessModifier;

public class AccessModifier_Test4 extends ProtectedAccessModifier {
    public static void main(String[] args) {

        System.out.println(AccessModifier_Test4.name2);//protected is visible outside of package if it is subclasses
        //System.out.println(AccessModifier_Test4.name1);//default is not visible outside of package


    }
}
