package my.gkfgk.dsa.number;

public class PrimeNumber {



    static boolean isPrimeNumber(int number) {
        boolean result = false;
        if(number <=1) {
            result= false;
        }else if(number <=3) {
            result= true;
        }else if(number >3) {
            if(number%2 == 0 || number%3 ==0)
                result= false;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(9));

    }
}
