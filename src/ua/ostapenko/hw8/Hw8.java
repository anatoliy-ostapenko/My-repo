package ua.ostapenko.hw8;

import java.util.Scanner;

public class Hw8 {
    public void main(String[] args) {
        Scanner scanner = new Scanner("Ведите размер массива, который больше 10:");
        Integer s = scanner.nextInt();
        if (s<10){
            System.out.println("Массив меньше 10");
        }
        //getUsersArray();
        System.out.println(randomArray(s));

    }
//    public static int getUsersArray (){
//        Scanner scanner = new Scanner("Ведите размер массива, который больше 10:");
//        Integer s = scanner.nextInt();
//        if (s<10){
//            System.out.println("Массив меньше 10");
//        }
//        return s;
//
//    }
    public static int[] randomArray (int arrSize){

        int[] array = new int[arrSize];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 12) - 100);
            System.out.println(array[i]);
        }
        return array;
    }

}
