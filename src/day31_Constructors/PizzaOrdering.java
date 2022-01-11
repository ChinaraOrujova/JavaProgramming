package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {

        Pizza pizza1=new Pizza('s',2,3);
        System.out.println(pizza1);

        ArrayList<Pizza> pizzas= new ArrayList<>();

        for (int i = 0; i <100; i++) {
            Pizza small=new Pizza('s',2,3);
            Pizza medium=new Pizza('m',3,4);
            Pizza large=new Pizza('l',4,5);

            pizzas.addAll(Arrays.asList(small,medium,large));

        }

        System.out.println("Total number of pizza: "+pizzas.size());

        double totalPrice=0;
        for (Pizza pizza : pizzas) {
            pizza.calcCost();
            totalPrice+=pizza.calcCost();
        }
        System.out.println(totalPrice);


    }
}
