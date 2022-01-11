package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {


        String password = "cLdeq1990@";

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigits = 0;
        int countSpeChar = 0;

        for (int i = 0; i<password.length();i++) {
            char each = password.charAt(i);
            if (Character.isUpperCase(each)){
                countUpperCase++;
            }else if(Character.isLowerCase(each)){
                countLowerCase++;
            }else if(Character.isDigit(each)){
                countDigits++;
            }else{
                countSpeChar++;
            }
        }
/*
        System.out.println("There are "+countUpperCase+" Upper Case letters");
        System.out.println("There are "+countLowerCase+" Lower Case letters");
        System.out.println("There are "+countDigits+" Digits");
        System.out.println("There are "+countSpeChar+" Special Character");
*/

      boolean hasUpperCase=countUpperCase>0;
      boolean hasLowerCase=countLowerCase>0;
      boolean hasDigit= countDigits>0;
      boolean hasSpecialCharacter=countSpeChar>0;

      boolean strongPassword=password.length()>=8&&!password.contains(" ")&&hasDigit&&hasLowerCase&&hasUpperCase&&hasSpecialCharacter;
        System.out.println("The password is strong: "+strongPassword);
    }
}
