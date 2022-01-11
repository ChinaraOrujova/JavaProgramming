package day34_GarbageCollection_AccessModifier;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("main method");
    }
    static { // it runs first before everything and will run only one time
        System.out.println("static block");

    }
    static {
        System.out.println("static block 2");
    }
}
