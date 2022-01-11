package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.setInfo("Toyota","Highlander","gray",2016,45);
        System.out.println(car1);

        Car car2=new Car();
        car2.setInfo("Audi", "A4","white",2017,35);
        System.out.println(car2);

        Car car3=new Car();
        car3.setInfo("Mazda","CX-7","red",2013,25);
        System.out.println(car3);

        ArrayList<Car> carList= new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2,car3));
        System.out.println(carList);

        for (Car each : carList) {
            System.out.println(each.brand+" : "+each.price);

        }
        System.out.println("-------------------------");

        carList.removeIf(p->p.brand.equals("Toyota")&&p.year>=2005&&p.year<=2008);
        carList.removeIf(p->p.brand.equals("Audi")&&p.year>=1995&&p.year<=1998);


    }

}
