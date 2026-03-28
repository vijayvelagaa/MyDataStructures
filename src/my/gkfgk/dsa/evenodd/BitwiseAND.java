package my.gkfgk.dsa.evenodd;

public class BitwiseAND {


    public static boolean isNumberEvenOdd (int number) {
        if((number&1) ==0) {
            return true;
        }else {
            return false;
        }
    }

    public static void main (String ar[]) {
        System.out.println(isNumberEvenOdd(101));
    }
}
