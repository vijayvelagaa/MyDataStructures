package my.gkfgk.dsa.closest.number;

public class ClosestNumber {


    static int findClosestNumber(int n, int m) {

        int q = n/m; //find the quotient
        //1east possible closest number
        int leastNumber = (n/m)*m;
        //second possible closest number
        int higherNumber = ((n/m)+1)*m;

        if(Math.abs(n-leastNumber) <= Math.abs(n-higherNumber)) {
            return leastNumber;

        }else {
            return higherNumber;
        }

    }



    public static void main(String[] args) {

        System.out.println( findClosestNumber(5,10));

    }
}
