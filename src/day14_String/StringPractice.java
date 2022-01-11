package day14_String;

public class StringPractice {
    public static void main(String[] args) {
        String str1 ="     batch 25    ";
        str1=str1.trim();
        System.out.println(str1);

        String str2 ="Cydeo School";
        int place = str2.indexOf("h");
        System.out.println(place);

        int n2=str2.indexOf("ool");
        System.out.println(n2);

        String str3 = "Java Programming";
        int n3=str3.indexOf("a ");
        System.out.println(n3);

        String str4 = "Java Programming";
        int n4=str4.indexOf("amm");
        System.out.println(n4);

        String str5 = "Java Programming Language";
        int n5=str5.indexOf("an");
        System.out.println(n5);

        String str6 = "Java Programming Language";
        int n6=str6.indexOf("g ");
        System.out.println(n6);

        String str7 = "Java Programming Language";
        int n7=str7.lastIndexOf("g");
        System.out.println("n7 = "+ n7);

        String str8 = "Java Nova Cava Wawa orange";
        int firstA = str8.indexOf("a");
        System.out.println(firstA);

        String str9 = "Java Nova Cava Wawa orange";
        int lastA = str9.lastIndexOf("a");
        System.out.println(lastA);

        String str10 = "Java Nova Cava Wawa orange";
        int secondA = str10.indexOf("a ");
        System.out.println(secondA);

        String str11 = "Java Nova Cava Wawa orange";
        int thirdA = str10.indexOf("a C");
        System.out.println(thirdA);

        String str12 = "Java Nova Cava Wawa orange";
        int fourthA = str12.indexOf("ava W");
        System.out.println(fourthA);

        String str13 = "Java Nova Cava Wawa orange";
        int fourthA2 = str13.lastIndexOf("av");
        System.out.println(fourthA2);

        String str14 = "Java Nova Cava Wawa orange";
        int fourthA3 = str14.indexOf("Ca")+1;
        System.out.println(fourthA3);

        String str15 = "Java Nova Cava Wawa orange";
        int fifthA = str15.indexOf("va")+1;
        //int fifthA = str15.indexOf("a W);
        System.out.println(fifthA);

        int sixthA = str15.lastIndexOf("aw");
        int seventh = str15.lastIndexOf("a ");
        //int seventh = str15.indexOf("a o");














    }
}
