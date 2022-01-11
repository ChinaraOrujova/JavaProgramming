package day10_NestedIf;

public class CharacterIdentity {

    public static void main(String[]args){

        /*
Create a class called Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the characters on ASCII table

         */
        char a = '1';


        if(a>=48 && a<=57){//(a>='0' && ch <= '9')
            System.out.println("Number");

        }
        else if((a>=65 && a<=90)||(a>=97 && a<=122)){ //(a >='A' && a<= 'Z')||(a>='a' && a<='z')
            System.out.println("Alphabet");

        }
        else {
            System.out.println("Special Character");
        }
    }

}
