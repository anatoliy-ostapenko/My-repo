package ua.ostapenko.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] myArray = createArray(15,100);
        int myCount = countNonSimpleNum(myArray);
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
    public static int countNonSimpleNum(int[] sourceArray){
        int count = 0;
        for(int i=0; i<sourceArray.length; i++ ){
            if(isNotSimple(sourceArray[i])){
                count++;
            }
        }
        return count;
    }
    public static boolean isNotSimple(int num){
        boolean isNotSimple = false;
        for (int i = 2; i < num; i++) {
             int c = num%i;
            if(num%i!=0){
                isNotSimple= false;
            }
            else{
                return true;
            }
        }
        return isNotSimple;
    }
}
