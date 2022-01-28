package q2;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение:");

        String sign = sc.nextLine();
        calc(sign);

    }
    public  static void calc(String str){
        int operand1 = 10;
        int operand2 = 3;
        if (str == "/")
            if (operand2 != 0)
            System.out.println(operand1 / operand2);
              else
                System.out.println("no zero");
        else if (str == "+")
            System.out.println(operand1 + operand2);
        else if (str == "-")
            System.out.println(operand1 - operand2);
        else
            System.out.println(operand1 * operand2);

        //return result;
//    }
}}
