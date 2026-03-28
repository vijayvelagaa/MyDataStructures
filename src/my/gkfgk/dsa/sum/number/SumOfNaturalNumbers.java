package my.gkfgk.dsa.sum.number;

public class SumOfNaturalNumbers {

    public static int firstNnumbers(int n) {
        int sum = 0;
        for(int x=1; x<=n; x++ ) {
            System.out.println("X Val : "+ x);
            sum = sum+x;
        }
        return sum;
    }

    public static void main (String[] ar) {
        System.out.println(firstNnumbers(5));
    }


}
