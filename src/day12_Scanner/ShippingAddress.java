package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Enter come form next()

        System.out.println("Enter your full name");
        String name = input.nextLine();//JavaProgrammingEnter


        System.out.println("Enter your building number");
        String buildingNumber = input.next();//7925A

        input.nextLine();
        System.out.println("Enter your street name");
        String streetName = input.nextLine(); //Bluemont ChapelEnter


        System.out.println("Enter your city name");
        String cityName = input.nextLine();


        System.out.println("Enter your state");
        String state = input.next();


        System.out.println("enter your zip code");
        String zipCode = input.next();

        input.nextLine();
        System.out.println("Enter your country name:");
        String country = input.nextLine();


        System.out.println("Shipping address is : " +"\n"+ name+"\n"+buildingNumber+" " +
                streetName +"\n"+cityName +", "+state+" "+zipCode+"\n"+country);

        input.close();
    }
}
