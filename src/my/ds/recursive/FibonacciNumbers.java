package my.ds.recursive;

import java.util.Scanner;

public class FibonacciNumbers {

    private static long[] fibonacciCache;
    public static long computeFibonacci(int num) {



        if(num <=1) {
            return num;
        }

        if(fibonacciCache[num] != 0) {
            return fibonacciCache[num];
        }

        long computedFibonacci = computeFibonacci(num-1) + computeFibonacci(num-2);
        fibonacciCache[num] = computedFibonacci;
        return computedFibonacci;


    }


    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int n =  s.nextInt();
        fibonacciCache = new long[n+1];
        System.out.println(computeFibonacci(n));
    }

}
