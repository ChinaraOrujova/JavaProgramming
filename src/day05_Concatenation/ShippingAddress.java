package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

/*
Create a class called ShippingAddress.java
Declare the following variables:
name
buildingNumber
streetName
city
state
zipCode

Use concatenation to print the full shipping address
 */

        String name = "Chinara Orujova";
        String buildingNumber = "23490";
        String streetName = "Bluemont Square";
        String city = "Ashburn";
        String state = "VA";
        String zipCode = "20000";

        String name1 = "Jason Orujov",
                buildingNumber1 = "10220",
                streetName1 = "Bluemont Chapel",
                city1 = "Leesburg",
                state1 = "VA",
                zipCode1 = "10000";

        String address = name  + "\n" + buildingNumber + " " + streetName +  "\n" + city + ", " + state + " " + zipCode;


        System.out.println( name  + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode);

        System.out.println(address);
    }
}
