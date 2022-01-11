package day16_ForLoopStringPractice;

public class WoodenSpoon {
    public static void main(String[] args) {

        String str = "Wooden Spoon";
        String result="";//contain the reverse version of string

        /*
        result +=str.charAt(11);n
        result +=str.charAt(10);o
        result +=str.charAt(9);o
        result +=str.charAt(8);p
        result +=str.charAt(7);S....

         */


        for (int i = str.length()-1; i>=0; i--) {//it is index number of str (starting from last index of index 0)
            result +=str.charAt(i);

        }
        System.out.println(result);



        /*
        Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW

         */
    }
}
