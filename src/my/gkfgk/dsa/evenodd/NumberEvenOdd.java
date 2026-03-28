package my.gkfgk.dsa.evenodd;

public class NumberEvenOdd {

    public static boolean isNumberEvenOROdd (int n) {
    boolean result = false;
        if(n!= 0) {
            int value = n % 2;
            if(value ==0)
                result =  true;

        }
        return result;

    }

    public static void main (String[] ar) {
       System.out.println ( isNumberEvenOROdd(0));
    }

}
