package Jan21;

public class Jan21 {
    public static void main(String[] args) {
        int mainNum = 22223334;
        numAmount(mainNum);
    }
    public static void numAmount (int mainNum){
        int even = 0;
        int odd = 0;

        while (mainNum > 0 ){

            if ( mainNum % 2 == 0)
                even++;
            else odd++;
            mainNum/=10;
         }
        System.out.println(odd);
        System.out.println(even);
        }
}
