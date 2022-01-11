package day34_GarbageCollection_AccessModifier;

public class Constructor_vs_StaticBlock {

    static {
        System.out.println("static block");

    }
    public Constructor_vs_StaticBlock(){
        System.out.println("Constructor");

    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();

    }
}
