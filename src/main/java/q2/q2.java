package q2;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        System.out.println(getRandom(-15,0));


    }
    public static int getRandom(int min, int max) {
        max++;
        return (int) (Math.random() * (min - max) + min);
    }
    }

