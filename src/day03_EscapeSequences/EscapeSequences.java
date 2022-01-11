package day03_EscapeSequences;
/*
escape sequence: Must be given with double quote
   \n: starts a new line

 */
public class EscapeSequences {

    public static void main(String[] args) {
        System.out.println("Java\nPython\nC#");

        System.out.println("------------------------------");

        System.out.println("Hello Cydeo \nHow are you all today? \nIt is nice to see you all. \nWhat classes do we have next week");
        System.out.println("-------------------------------------------");
        System.out.println("\tJava is cool Programming language");
        System.out.println("------------------------------");
        System.out.println("/ \\"); //in order to print one back slash we need to give two back slaches
        System.out.println("My favorite TV show is \"Game of Throne\""); //in order to get double quote we need to use forward slash and *
    }
}
