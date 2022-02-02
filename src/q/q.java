package q;

import java.util.Random;
import java.util.Scanner;

public class q {
    public static void main(String[] args) {
        int n = 0;
        int[][] mas = new int[n][n];
        Random random = new Random();
        int min = -15;
        int max = 15;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) Math.round((Math.random() * max) - min);
                System.out.print(mas[i][j]);

}
//public static int counter(int num){
//        
//    if (num <=14)
//        System.out.println(" 1 to 14");
//    else if (num>14 && num<=35)
//        System.out.println("14 to 35");
//    else if (num>35 && num<=50)
//        System.out.println("35 to 50");
//    else
//        System.out.println("more than 50");
//    return num;
}
}}
