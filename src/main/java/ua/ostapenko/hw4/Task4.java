package ua.ostapenko.hw4;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Task4 {
    public static void main(String[] args) {

        int[] randomNumsArray = new int[2000];
        createArray(randomNumsArray);

        System.out.println(Arrays.toString(randomNumsArray));
        System.out.println(Arrays.toString(removeEvenArray(randomNumsArray)));
    }

    public static int rnd(int max) {
        int a = (int) (Math.random() * ++max);
        return a;
    }
    public static void createArray(int[] randomArray){
        final int max = 100;

        for (int i = 0; i < randomArray.length; i++) {
            final int rnd = rnd(max);
            randomArray[i]=rnd;
        }
    }
    public  static int[] removeEvenArray(int[] parentArray){
        int[] newArray = new int[2000];

        for (int i = 0; i < parentArray.length; i++) {

            if (parentArray[i] % 2 == 0){

            }
            else{
                newArray[i] = parentArray[i];
            }
        }
            return newArray;
    }
}
