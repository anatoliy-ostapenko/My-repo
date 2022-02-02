package Jan28;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray(5,10)));

    }
//    public  static  int[][] createRandomArray(int[][] newArray){
//        Random random = new Random();
//        for (int i = 0; i < newArray.length; i++) {
//            for (int j = 0; j < newArray.length; j++) {
//                newArray[i][j] = random.nextInt(5);
//            }
//        }
//        return newArray;
//    }
public static int[][] createArray (int size, int scale){
    int[][] randomArray = new int[size][scale];
    Random myRandom = new Random();
    for (int i = 0; i < randomArray.length; i++) {
        for (int j = 0; j <randomArray.length ; j++) {
            int numbs = myRandom.nextInt(scale);
            randomArray[i][j] = numbs;
        }
    }
    return randomArray;
}
}
