package ua.ostapenko.hw8;

import java.util.Arrays;
import java.util.Scanner;

public class Hw8 {
    public static void main(String[] args) {
        int[] randomArray = null;
        int sizeArray = getUsersSizeArray();
        randomArray = createRandomArray(sizeArray);
        System.out.println(Arrays.toString(randomArray));
        System.out.println(" Введите < для сортировки по возрастанию или > по убыванию ");
        Scanner scanner2 = new Scanner(System.in);
        String s2 = scanner2.nextLine();
        System.out.println(Arrays.toString(sortArray(s2, randomArray)));
        System.out.println(Arrays.toString(getExponent(randomArray)));

    }

    public static int getUsersSizeArray() {

        System.out.println("Введите размер массива, он должен быть больще 10 ");
        Scanner scanner = new Scanner(System.in);
        Integer s = scanner.nextInt();
        int result;
        if (s >= 10) {
            result = s;
        }
        else{
            System.out.println("Массив меньше 10");
            result = getUsersSizeArray();
        }
        return result ;
    }

    public static int[] createRandomArray(int arrSize) {

        int[] array = new int[arrSize];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 201) - 15);
        }
        return array;
    }

    public static int[] sortArray(String sortingMethod, int[] arrNum) {
        int temp = 0;
        int temp2 = 0;
        if (sortingMethod.equals("<")) {
            for (int i = 0; i < arrNum.length; i++) {
                for (int j = i + 1; j < arrNum.length; j++) {
                    if (arrNum[i] > arrNum[j]) {
                        temp = arrNum[i];
                        arrNum[i] = arrNum[j];
                        arrNum[j] = temp;
                    }
                }
            }
        } else if (sortingMethod.equals(">")) {
            for (int i = 0; i < arrNum.length; i++) {
                for (int j = i + 1; j < arrNum.length; j++) {
                    if (arrNum[i] < arrNum[j]) {
                        temp2 = arrNum[i];
                        arrNum[i] = arrNum[j];
                        arrNum[j] = temp2;
                    }

                }
            }
        } else {
            System.out.println("выбор не правильный");
        }
        return arrNum;

    }

    public static int[] getExponent(int[] arr) {
        for (int i = 2; i < arr.length; i += 3) {
            arr[i] = (int) Math.pow(arr[i], 3);
        }
        return arr;
    }

}
