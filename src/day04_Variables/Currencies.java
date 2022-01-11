package day04_Variables;

public class Currencies {

    public static void main(String[] args) {

        int dollar = 1000;
        //convert the dollar to euro or lira or azn
        // jpy, pound, peso, cad, riyal...

        double lira = dollar * 9.53;
        double euro = dollar * 0.86;
        double jpy = dollar * 114.09;
        double pound = dollar * 0.73;
        double peso = dollar * 20.88;
        double cad = dollar * 1.24;
        double riyal = dollar * 3.75;
        double azn = dollar * 1.70;

        System.out.println("dollar = " + dollar);
        System.out.println("euro = " + euro);
        System.out.println("lira = " + lira);
        System.out.println("azn = " + azn);
        System.out.println("riyal = " + riyal);
        System.out.println("cad = " + cad);
        System.out.println("peso = " + peso);
        System.out.println("pound = " + pound);
        System.out.println("jpy = " + jpy);

    }
}
