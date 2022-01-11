package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChar {
    public static void main(String[] args) {
        String str = "Cydeo1234School!@#$%WoodenSpoon";

        String digits = "";
        String letters = "";
        String specialCharacter = "";

        for (int i = 0; i < str.length(); i++) { //i: index numbers of str (0~str  index)

            char ch = str.charAt(i); //ch: each character that we have in str
            if (ch >= '0' && ch <= '9') {// if the character is between '0' to '9'
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {//if the character is between 'A' to 'Z' then it is letter
                letters += ch;
            } else {
                if (ch != ' ') {//if the special character is not a space
                    specialCharacter += ch;
                }

            }
            System.out.print("Digits: " + digits);
            System.out.print("\nLetters: " + letters);
            System.out.print("\nSpecial Character: " + specialCharacter);
        }

    }

}
