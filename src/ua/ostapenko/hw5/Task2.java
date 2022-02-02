package ua.ostapenko.hw5;


public class Task2 {
    public static void main(String[] args) {

        int[] arr= { 9, 8, 4 , 3, 1 };

        //checkSortArray(arr);
        System.out.println(isCheckSortArray(arr));

    }

    public static boolean isCheckSortArray(int[] randomArray){

        for (int i = 0; i < randomArray.length; i++) {
           if (i==0){
               continue;
           }
           int prevEl = i-1;
           if(randomArray[prevEl] < randomArray[i]){
             return false;
           }
    }
        return true;
    }}
