package day24_CustomMethod_Return;

public class UniqueCharacter {
    public static void main(String[] args) {
        unique("casssa");

    }
    public static void unique(String str){
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                System.out.println(str.charAt(i)+" is unique character");
            }

        }

    }

}
