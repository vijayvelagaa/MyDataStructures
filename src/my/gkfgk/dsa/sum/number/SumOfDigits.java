package my.gkfgk.dsa.sum.number;

public class SumOfDigits {

    static int findSumOfDigits(int number) {


        int sum = 0;

        while (number >0) {
           sum += number % 10;

            number = number/10;
        }

        return sum;
    }





    public static void main(String[] args) {

        System.out.println(findSumOfDigits(24895));
    }

}
