package day24_CustomMethod_Return;

public class ReturnMethod3 {
    public static void main(String[] args) {
        String str ="aabccdee";
        int frequency=frequency(str,'a');
        System.out.println(frequency);

        for (int i = 0; i <str.length() ; i++) {
            frequency =frequency(str,str.charAt(i));

            if(frequency==1){
                System.out.println(str.charAt(i));
            }

        }

    }

    public static int frequency(String str,char ch){
        int count=0;
        for (char each:str.toCharArray()) {
            if(each==ch){
                count++;
            }

        }
        return count;
    }
}
//unique character from string