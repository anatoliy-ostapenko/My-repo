package ua.ostapenko.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] myArray = createArray(400,100);
        System.out.println(arithMean(myArray));
        System.out.println(geoMean(myArray));
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

    public static double arithMean(int[] num){
        double totalAmount = 0;
        double sumArithmetic = 0;
        for (int j = 0; j < num.length; j++) {
            totalAmount += num[j];
            //return sumArithmetic;
        }
        sumArithmetic = totalAmount/ num.length;
        return sumArithmetic;
    }

public static double geoMean(int[] arr) {
    if (arr.length == 0) {
        return 0.0;
    }
    double gm = 1.0;
    for (int i = 0; i < arr.length; i++) {
        gm *= arr[i];
    }
    gm = Math.pow(gm, 1.0 / arr.length);
    return gm;
}
}
