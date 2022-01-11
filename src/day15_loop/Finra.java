package day15_loop;

public class Finra {
    public static void main(String[] args) {

        for (int i =1; i<=100;i++){
            if (i%3==0 && i%5==0){
                System.out.print("Finra ");

            }else if (i%3==0){
                System.out.print("Fin ");
            }else if (i%5==0){
                System.out.print("Ra ");
            }else{
                System.out.print(i + " ");
            }
        }
    }
}

