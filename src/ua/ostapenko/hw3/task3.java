package ua.ostapenko.hw3;
import java.util.StringTokenizer;

public class task3 {
    public static void main(String[] args) {
        String strq = "One two       three four five ";
        System.out.println("Number of words : " + wordsCounter(strq));
    }
    public static int wordsCounter(String str){
        StringTokenizer tokens = new StringTokenizer(str);
        return tokens.countTokens();
    }
}
