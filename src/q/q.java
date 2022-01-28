package q;

import java.util.Scanner;

public class q {
    public static void main(String[] args) {
     //int num = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        int number = sc.nextInt();
        System.out.println(counter(number));

}
public static int counter(int num){
        
    if (num <=14)
        System.out.println(" 1 to 14");
    else if (num>14 && num<=35)
        System.out.println("14 to 35");
    else if (num>35 && num<=50)
        System.out.println("35 to 50");
    else
        System.out.println("more than 50");
    return num;
}
}
