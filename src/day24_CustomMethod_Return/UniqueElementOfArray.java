package day24_CustomMethod_Return;

public class UniqueElementOfArray {
    public static void main(String[] args) {

    }
    //create a method that can display the unique elements of array
    public static void unique(String[] str){//["Layan","Layan","Chinara","Adam","Adam","Muhtar","Muhtar"]
        String unique="";
        for (String each:str) {
            int count=0;
            for (String s : str) {
                if (s.equals(each)){
                    count++;
                }
            }
            if (count==1){
                unique=each;
                System.out.println(unique);
            }

        }
    }
}
