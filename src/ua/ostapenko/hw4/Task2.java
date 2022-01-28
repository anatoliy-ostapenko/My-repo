package ua.ostapenko.hw4;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        int[] myArray = createArray(15,10);
        int myCount = countSimpleNum(myArray);
        System.out.println(myCount);
        System.out.println(Arrays.toString(myArray));
    }
    public static int[] createArray (int size, int scale){
        int[] randomArray = new int[size];
        Random myRandom = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            int numbs = myRandom.nextInt(scale);
            randomArray[i] = numbs;
        }
        return randomArray;
    }
    public static int countSimpleNum(int[] sourceArray){
        int count = 0;
        for(int i=0; i<sourceArray.length; i++ ){
            if(isSimple(sourceArray[i])){
                count++;
            }
        }
        return count;
    }

    public static boolean isSimple(int num){
        boolean isSimpl = false;
        for (int i = 2; i < num; i++) {
            if(num%i!=0){
                isSimpl= true;
            }
            else{
                return false;
            }
        }
        return isSimpl;
    }

}
