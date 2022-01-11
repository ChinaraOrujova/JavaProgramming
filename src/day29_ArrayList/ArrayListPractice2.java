package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<String> employees=new ArrayList<>();
        employees.addAll(Arrays.asList("Ali","David","Ahmed","Jimmy","Daniel","Aaron","Ahmed","David","Shay"));

        employees.retainAll(Arrays.asList("David","Ahmed"));
        System.out.println(employees);

        System.out.println("------------------------------");

        String [] array ={"Mary","Monica","Mehray","Musti","Sumeyra","Hasan","Beril"};

        ArrayList<String> names=new ArrayList<>(Arrays.asList(array));
        names.removeIf(p->p.toUpperCase().startsWith("M"));
        System.out.println(names);

        array=names.toArray(new String[0]);
        System.out.println(Arrays.toString(array));

    }
}
