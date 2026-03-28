package my.ds.leetcode.easy;

import java.util.Arrays;

/**
 * We can start with two pointers {@code i} and {@code j}, initialized to {@code m-1} and {@code n-1}, respectively.
 * We will also have another pointer {@code k} initialized to {@code m+n-1},
 * which will be used to keep track of the position in nums1 where we will be placing the larger element.
 * Then we can start iterating from the end of the arrays i and j, and compare the elements at these positions.
 * We will place the larger element in nums1 at position k, and decrement the corresponding pointer i or j accordingly.
 * We will continue doing this until we have iterated through all the elements in nums2.
 * If there are still elements left in nums1, we don't need to do anything because they are already in their correct place.
 *
 */


public class MergeSortedArray {

    /**
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     * @return nums1
     */
    private static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }


        return nums1;

    }

    public static void main(String[] args) {

        //int[] nums1 = { 1,2,3,0,0,0};
        //int[] nums2 = {2,5,6};
        //int m =3;
        //int n=3;

        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0;
        int n = 1;

        nums1 = merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

    }


}
