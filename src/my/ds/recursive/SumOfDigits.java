package my.ds.recursive;

public class SumOfDigits {

    static int sumOfDigits(int num) {

        if(num==0) {
            return num;
        }
        return (num%10 + sumOfDigits(num/10));

    }


    public static void main(String[] args) {
        System.out.println(sumOfDigits(1457845456));
    }


}
