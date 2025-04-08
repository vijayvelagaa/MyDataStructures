package my.ds.leetcode.easy;


import java.util.Arrays;

//Leet 27
public class RemoveElement {


    private static int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return j;

    }


    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        System.out.println(removeElement(nums,val));
    }
}
