package utilities;

import day34_GarbageCollection_AccessModifier.AccessModifiers;


public class AccessModifier_Test {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
       // System.out.println(AccessModifiers.defaultData);//default is not visible outside of the package
       // System.out.println(AccessModifiers.privateData);//private access modifier is not visible outside class

        AccessModifiers.method1();
       // AccessModifiers.method2();
       // AccessModifiers.method3();

    }

}
