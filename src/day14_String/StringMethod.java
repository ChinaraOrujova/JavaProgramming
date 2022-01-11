package day14_String;

public class StringMethod {
    public static void main(String[] args) {
        String str = "Java is fun,I love learning Java";
        String str2 = str.replace("Java", "Python");
        System.out.println(str);
        System.out.println(str2);

        String email = "JohnSmith@yahoo.com";
        email = email.replace("yahoo.com", "gmail.com");
        System.out.println(email);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python";
        sentence = sentence.replace("Python", "").replace("  ", " ");
        System.out.println(sentence);

        String s = "Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog", "Cat");
        System.out.println(s);

        String s2 = "C# is fun, C# is cool";
        s2 = s2.replace("C# is c", "Java is c");
        System.out.println(s2);

        String result = "Java Java Java";
        result = result.replaceFirst("Java", "Python");
        System.out.println(result);

        String result3 = "Java";
        result3 = result3.replaceFirst("va", "vo");
        System.out.println(result3);


    }
}


