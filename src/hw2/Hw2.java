package hw2;

public class Hw2 {
    public static void main(String[] args) {

            System.out.println("Площадь: " + triangleSquare(new double[]{0.0,0.0},new double[]{3.0,0.0},new double[]{0.0,4.0}));
    }
    public static double triangleSquare(double[] coord1, double[] coord2, double[] coord3  ){
//        double x1 = 0.0,
//                x2 = 3.0,
//                x3 = 0.0;
//        double y1 = 0.0,
//                y2 = 0.0,
//                y3 = 4.0;
        double x1 = coord1[0],
                x2 = coord2[0],
                x3 = coord3[0];
        double y1 = coord1[1],
                y2 = coord2[1],
                y3 = coord3[1];


        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double p = (a + b + c) / 2.0;
        double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return square;
    }
}
