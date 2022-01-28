package ua.ostapenko.hw3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String str = sc.nextLine();

        //String str = "      one two three         ";
        System.out.println(deleteSpace(str));
        System.out.println("iS Palindrome? :"+ isPalindrome(str));


    }
   public static String deleteSpace(String strNoSpace){
        String str = strNoSpace;
       str = str.replaceAll("\\s", "");
       return str;
   }
    static boolean isPalindrome(String strNoSpace2) {
        int i = strNoSpace2.length()-1;
        int j=0;
        while(i > j) {
            if(strNoSpace2.charAt(i) != strNoSpace2.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}
