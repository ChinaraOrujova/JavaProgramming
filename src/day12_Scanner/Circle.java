package day12_Scanner;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle");
        double radius = scan.nextDouble();
        scan.close();

        double area = radius * radius * 3.14;
        double perimeter = 2 * radius * 3.14;

        System.out.println("area: "+ area);
        System.out.println("perimeter: " + perimeter);


    }
}
