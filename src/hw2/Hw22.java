package hw2;

public class Hw22 {

    public static void main(String[] args) {
        int d =6;
        System.out.println(CheckNumber(d));


    }
    public static int CheckNumber(int a) {
        if ( a % 2 ==0 )
            System.out.println("Четное число");
            else
            System.out.println("Нечетное число");
        return a;
    }
}
