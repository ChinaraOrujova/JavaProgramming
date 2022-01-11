package day15_loop;

import java.util.Locale;

public class ForMatFullName {
    public static void main(String[] args) {
        String name ="cyDEo",
        lastname = "SCHOOL";

        //name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        name = ("" + name.charAt(0)).toUpperCase() + name.substring(1).toLowerCase();

        lastname = lastname.substring(0,1).toUpperCase() + lastname.substring(1).toLowerCase();
        System.out.println("fullname = " + name + " " + lastname);
    }
}
