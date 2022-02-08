package ua.ostapenko.hw4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
       int[] myArray = createArray(1000,10);
       // int[] myArray = {1,2,3,4,5,6,7,8,9,10};
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
            if(isSimple(sourceArray[i]) ){
                count++;
            }
        }
        return count;
    }

    public static boolean isSimple(int num){

        boolean isSimpl = false;
        if (num == 2){
            return true;
        }
        for (int i = 2; i < num; i++) {
            if (num%i!=0){
                isSimpl = true;
            }
            else{
                return false;
            }
        }
        return isSimpl;
    }

}
