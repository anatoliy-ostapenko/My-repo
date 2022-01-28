package q2;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение:");

        String sign = sc.nextLine();
        System.out.println(calc(sign));

    }
    public  static String calc(String str){
        String result = "";
        int operand1 = 10;
        int operand2 = 3;
        if (str.charAt(0)  == '/')
            if (operand2 != 0)
                System.out.println(operand1 / operand2);
            else
                result ="no zero";
        else if (str.charAt(0)  == '+'){
            int a = operand1 + operand2;
            result = String.valueOf(a);
        }
        else if (str.charAt(0) == '-')
        {
            int a = operand1 - operand2;
            result = String.valueOf(a);
        }

        else if (str.charAt(0)  == '*'){
            int a = operand1 * operand2;
            result = String.valueOf(a);
        }
        else
            result = "Знак";


        return result;
//    }
}}
