package day27_WrapperClasses;

public class StrongPassword {
    public static void main(String[] args) {

        String password="Lali19$!";
        int upperCaseLetter=0;
        int lowerCaseLetter=0;
        int specialChar =0;
        int digit=0;
        boolean isStrong;

        for(char each:password.toCharArray()){
            if(Character.isUpperCase(each)){
                upperCaseLetter++;
            }else if(Character.isLowerCase(each)){
                lowerCaseLetter++;
            }else if(Character.isDigit(each)){
                digit++;
            }else{
                specialChar++;
            }
        }
        if(password.length()>=8&&!password.contains(" ")&&upperCaseLetter>=1&&lowerCaseLetter>=1&&specialChar>=1){
            isStrong=true;

        }else{
            isStrong=false;
        }
        System.out.println("Is password strong? "+isStrong);

    }
}

/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit

 */