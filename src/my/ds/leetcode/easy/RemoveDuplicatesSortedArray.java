package my.ds.leetcode.easy;

import my.ds.Array.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesSortedArray {

   ;
    public static int removeDuplicatesFromSortedArray(int[] nums) {

       int j=1;

       for(int i=1; i<nums.length; i++) {
           if(nums[i] != nums[i-1]) {
               nums[j] = nums[i];
               j++;
           }
       }
       nums = nums;

        System.out.println(Arrays.toString(nums));

      return j;

    }




    public static void main(String[] args) {

        //int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] nums = {1,1,2};
        int uniqueNum = removeDuplicatesFromSortedArray(nums);
        System.out.println(uniqueNum);
    }
}
