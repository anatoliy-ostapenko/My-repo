package q2;

public class q4 {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        System.out.println(sum1(a,b));
        System.out.println(even(a,b));
    }
    public  static  int sum1(int a, int b){
        int sum = 0;
        for (int i = a; i < b ; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public  static  int even(int a, int b){
        int sum =0;
        for (int i = a; i < b; i++) {
            if(i%2 == 0){
                sum = sum+i;
            }
        }
        return sum;
    }
}
