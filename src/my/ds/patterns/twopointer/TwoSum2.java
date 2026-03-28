package my.ds.patterns.twopointer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
find two numbers such that they add up to a specific target number.
Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers index1 and index2, each incremented by one,
as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.
**/

public class TwoSum2 {

    //Brute force solution
    public static int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> temp = new HashMap<>();
        int[] indices = new int[2];
        for(int i=0; i < numbers.length-1; i++) {
            int number = numbers[i];
            int findNum = target - number;


            if (temp.get(findNum) != null) {
                indices[0] = temp.get(findNum)+1;
                indices[1] = i+1;
                return indices;
            } else {
                    temp.put(number, i);
            }
           for(int j=i+1; j <= numbers.length-1; j++) {
               if (findNum == numbers[j]) {
                   indices[0] = i+1;
                   indices[1] = j+1;
                   return indices;
               }
           }

        }


        return indices;
    }

    // Optimal solution with Two Pointers
    public static int[] optimalTwoSum(int[] numbers, int target){

        int left = 0;
        int right = numbers.length - 1;
        while(left < right) {
            int sum = numbers[left] + numbers [right];
            if(sum == target) {
                return new int[]{left+1, right+1};

            } else if(sum < target) {
                left ++;
            } else if(sum > target) {
                right --;
            }
        }
        return new int[2];
    }

    public static void main(String[] args) {
        int[] result1 = twoSum(new int[]{2,7,11,15}, 9);
        int[] result2 = twoSum(new int[]{2,3,4}, 6);
        int[] result3 = twoSum(new int[]{-1,0}, -1);
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }
}
