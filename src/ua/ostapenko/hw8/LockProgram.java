package ua.ostapenko.hw8;

import java.util.Arrays;

public class LockProgram {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        Lock lock = new Lock(arr);
        lock.printArray();
        lock.getArray()[0] = 10;
        lock.printArray();
    }
}


class Lock {
    private int[] array;

    public Lock(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return this.array.clone();

    }

    public void printArray() {
        System.out.println(Arrays.toString(this.array));
    }

}
