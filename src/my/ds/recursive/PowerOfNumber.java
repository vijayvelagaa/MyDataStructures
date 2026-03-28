package my.ds.recursive;

public class PowerOfNumber {

    static int powerOfNumber(int n, int p) {
        if(p==1) {
            return n;
        }

        return n*powerOfNumber(n,p-1);
    }


    public static void main(String[] args) {
        System.out.println(powerOfNumber(5,2));
    }
}
