package my.ds.Array;

import java.util.Arrays;

public class SlidingWindow {

    //Brute force solution for fixed window
    public static void findSubArraySum(int[] numArray, int k) {
       int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<=numArray.length-k; i++) {
            System.out.println("i>>"+i);
            int sum =0;
            for(int j=i; j<i+k; j++) {
                //System.out.println("J>>"+j);
               sum = sum+numArray[j];
            }
           maxSum = Math.max(maxSum,sum);

        }
        System.out.println(maxSum);

    }

    //optimal solution


    //Varible Sliding window

    public static int minSubarrayLength(int[] arr, int s) {

        int minLength = Integer.MIN_VALUE;
        int left = 0, windowSum=0;

        for(int right=0; right<arr.length; right++) {
            windowSum += arr[right];


            while(windowSum >= s) {
                minLength = Math.min(minLength, right-left+1);
                windowSum -= arr[left];
                left++;
            }


        }


        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }



    public static void main(String[] ar) {
            int[] slidingArray = {2,1,5,1,3,2};
            int[] arr = {2,3,1,2,4,3};
            int s = 7;
            //SlidingWindow.findSubArraySum(slidingArray,3);
        SlidingWindow.minSubarrayLength(arr,s);
        System.out.println(Integer.MIN_VALUE);
    }
}
