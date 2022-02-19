package q2;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Operand1:");
        int str = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("math action");
        String str2 = sc2.nextLine();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Operand2:");
        int str3 = sc3.nextInt();

        System.out.println(ops(str, str3, str2));
    }

    public  static int ops(int a, int b, String c){
        int result = 0;

        if(c.equals("+")) {
            result = a + b;
        }
            else if
        (c.equals("-"))
            {
                result= a-b;
            }
            else if (c.equals("/"))
            {
                result = a/b;
        }
        else
            result = a*b;

        return result;
    }
}
