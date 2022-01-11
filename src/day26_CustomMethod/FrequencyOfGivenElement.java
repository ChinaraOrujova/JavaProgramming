package day26_CustomMethod;

public class FrequencyOfGivenElement {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        int count = frequencyOfGivenElement(array, 1);
        System.out.println(count);

        double[] array1 = {1.2, 1.4, 1.2, 1.4, 1.4, 1.4};
        count=frequencyOfGivenElement(array1,1.4);
        System.out.println(count);

        char[] array2={'a','a','d','c','c','c'};
        count=frequencyOfGivenElement(array2,'c');
        System.out.println(count);

        String[] array3={"Chinara","Chinara","Jason","Jason","Jasmine"};
        count=frequencyOfGivenElement(array3,"Jason");
        System.out.println(count);

    }

    public static int frequencyOfGivenElement(int[] array, int element) {
        int frequency = 0;
        for (int each : array) {
            if (element == each) {
                frequency++;
            }

        }
        return frequency;
    }

    public static int frequencyOfGivenElement(double[] array, double element) {
        int frequency = 0;
        for (double each : array) {
            if (element == each) {
                frequency++;
            }

        }
        return frequency;
    }

    public static int frequencyOfGivenElement(char[] array, char element) {
        int frequency = 0;
        for (char each : array) {
            if (element == each) {
                frequency++;
            }

        }
        return frequency;
    }

    public static int frequencyOfGivenElement(String[] array, String element) {
        int frequency = 0;
        for (String each : array) {
            if (element == each) {
                frequency++;
            }

        }
        return frequency;
    }
}


