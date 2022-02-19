package ua.ostapenko.hw2;

public class Hw23 {
    public static void main(String[] args) {
        double a1 = Math.abs(-3.14);
        double b2 = Math.abs(1.012);
        double c3 = Math.abs(-8);
        //double min;
        System.out.println(minNumber(a1,b2,c3));

    }

    public static  double minNumber(double a, double b, double c){
        double min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);


        return min;

    }
}
