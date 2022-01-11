package day27_WrapperClasses;

public class WrapperClassMethod {
    public static void main(String[] args) {
        String str="1234";
        int num=Integer.parseInt(str);
        System.out.println(num+1);
        System.out.println(str+1);

        String str2="10.5";
        double num1=Double.parseDouble(str2);
        System.out.println(num1+1);

        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;

        System.out.println("max: "+max);
        System.out.println("min: "+min);

        long maxLong=Long.MAX_VALUE;
        long minLong=Long.MIN_VALUE;
        System.out.println("max for long: "+maxLong);
        System.out.println("min for long: "+minLong );

        String s1="maybe";
        boolean r1=Boolean.parseBoolean(s1);
        System.out.println(r1);

        String s2="123";
        Integer x=Integer.valueOf(s2);
        int y=Integer.valueOf(s2);
        System.out.println(x);
        System.out.println(y);

        String s3="1.5";
        Double z= Double.valueOf(s3);
        double w=Double.valueOf(s3);
        System.out.println(z);
        System.out.println(w);

        System.out.println("---------------------------");

        //isDigit()
        char ch1='0';
        boolean isDigit=Character.isDigit(ch1);
        System.out.println(isDigit);

        char ch2='A';
        boolean isLetter=Character.isLetter(ch2);
        System.out.println(isLetter);

        char ch3='!';
        boolean isSpeChar=!Character.isLetterOrDigit(ch3);
        System.out.println(isSpeChar);

        char ch4='a';
        boolean isUpperCase=Character.isUpperCase(ch4);
        System.out.println(isUpperCase);

        char ch5='A';
        boolean isLowerCase=Character.isLowerCase(ch5);
        System.out.println(isLowerCase);

        System.out.println("---------------------------");
        String s = "ab1cde2efg3g3hi4";
        int sum=0;
        for(char each:s.toCharArray()){
            if(Character.isDigit(each)){
                sum+= Integer.parseInt(each+"");
            }
        }
        System.out.println("sum: "+sum);

    }
}
