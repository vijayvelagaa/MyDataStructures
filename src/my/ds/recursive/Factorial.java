package my.ds.recursive;

import java.util.Scanner;

public class Factorial {

    // recursive
    public static int factorial(int number) {

        int fact =1;

        if(number == 0 || number == 1) {
            return fact;
        }
           return  number*factorial(number -1);

    }

    public static int iterativeFactorial (int number) {
        int fact =1;

        if(number ==1) {
            return fact;
        }
        else {
            for (int i = number; i >= 1; i--) {
                fact = fact * i;
            }
        }

        return fact;
    }


    public static void main(String[] args) {
        //System.out.println(Factorial.factorial(5));

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(Factorial.iterativeFactorial(5));
    }


}
