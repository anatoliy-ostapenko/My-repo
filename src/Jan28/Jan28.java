package Jan28;

import java.util.Arrays;

public class Jan28 {
    public static void main(String[] args) {
        int[] randomNumsArray = new int[12];
        createArray(randomNumsArray);

        System.out.println(Arrays.toString(randomNumsArray));
        System.out.println(sumPrices(randomNumsArray));

    }
    public static int rnd(int max) {
        int a = (int) (Math.random() * 15-15);
        return a;
    }
    public static void createArray(int[] randomArray){
        final int max = 5;

        for (int i = 0; i < randomArray.length; i++) {
            final int rnd = rnd(max);
            randomArray[i]=rnd;
        }
    }
    public  static  int sumPrices (int[] randomArray){
        //int[] newArray = new int[12];
        int sum = 0;
        for (int i = 0; i < randomArray.length; i++) {
            if(randomArray[i] > 1000){
                sum=sum+randomArray[i];
            }
        }
        return  sum;
    }
}
