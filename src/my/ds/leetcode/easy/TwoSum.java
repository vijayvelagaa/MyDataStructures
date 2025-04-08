package my.ds.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public int[] twoSum(int[] nums, int target) {


        int[] positions = new int[2];
        Map<Integer, Integer> verifiedNumMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {

            int pair = target-nums[i];
            if(verifiedNumMap.get(pair) != null ) {
                positions[0] = i;
                positions[1]=verifiedNumMap.get(pair);
            }

            verifiedNumMap.put(nums[i], i);
        }

        return positions;
    }


    public static void main(String[] ar) {

        int[] nums = {2,11,15,7};
        int target = 9;

        System.out.println (Arrays.toString(new my.ds.Array.TwoSum().twoSum(nums,target)));
    }
}
