package ua.ostapenko.hw5;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] arrBefore = {{9, 8, 2}, {3, 4, 5}, {6, 7, 8}};

        int[][] arrAfter = transformArray(arrBefore);
        System.out.println(Arrays.deepToString(arrAfter));

    }
    public  static int[][] transformArray( int[][] arrBefore){
        //int[][] arrAfter = new int[arrBefore[0].length] [arrBefore[0].length];
        int[][] arrAfter = new int[3][3];
        for (int i = 0; i < arrBefore.length; ++i) {
            for (int j = 0; j < arrBefore.length; ++j) {
                arrAfter[i][j] = arrBefore[j][i];
            }
        }
        return arrAfter;
    }
}