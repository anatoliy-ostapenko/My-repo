package ua.ostapenko.hw5;

import java.util.Arrays;


public class Task1 {
    public static void main(String[] args) {
       int[][] randomNmsArray = new int[7][3];
        genArray(randomNmsArray);
        System.out.println(Arrays.deepToString(randomNmsArray));
    }

    public static void genArray(int[][] someArray){

        for (int i = 0; i < someArray.length; i++) {

            for (int j = 0; j < someArray[i].length; j++) {
                int size = someArray[j].length * i;
                if(i %2 != 0){
                    someArray[i][j] = -1*(j + 1+size);
                }
                else {
                    someArray[i][j] = j + 1+size;
                }
            }
        }
    }
}
