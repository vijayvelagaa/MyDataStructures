package my.gkfgk.dsa.numbertoascii;

public class NumberToASCII {


    public static void convertNumberToASCII(int n) {
        //[0-9] numbers range in ASCII [48-57]

        while (n >0) {
            int d=n%10;
           // System.out.println(d);
            //System.out.println(d + " (" + (d+48) + ")");
            n=n/10;
            System.out.println(n);
        }


    }

    public static void main(String[] ar) {
        int n = 36;
        convertNumberToASCII(n);
    }
}
