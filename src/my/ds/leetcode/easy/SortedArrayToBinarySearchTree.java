package my.ds.leetcode.easy;

import com.sun.source.tree.Tree;

public class SortedArrayToBinarySearchTree {


    public static TreeNode sortedArrayToBST(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

       return  buildBST(nums, left, right);
    }

    public static TreeNode buildBST(int[] nums, int left, int right) {

        if(left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;
        TreeNode rootNode = new TreeNode(nums[mid]);



        rootNode.left = buildBST(nums,left,mid-1);
        rootNode.right = buildBST(nums,mid+1, right);


        return rootNode;
    }
        //My Thinking, not working
      /*  TreeNode tempNode = new TreeNode();


        for(int i=0; i<nums.length; i++) {

            if(nums[i] < mid) {
                if(rootNode.left == null) {
                    rootNode.left = new TreeNode(nums[i], null, null);
                    tempNode = rootNode.left;
                } else {
                    if(nums[i] < tempNode.val) {
                        tempNode.left = new TreeNode(nums[i], null, null);
                        tempNode = tempNode.left;
                } else {
                        tempNode.right = new TreeNode(nums[i], null, null);
                        tempNode = tempNode.right;
                    }


            }

            }

            if(nums[i] > mid) {
                if(rootNode.right == null) {
                    rootNode.right = new TreeNode(nums[i], null, null);
                    tempNode = rootNode.right;
                } else {
                    if(nums[i] < tempNode.val) {
                        tempNode.left = new TreeNode(nums[i], null, null);
                        tempNode = tempNode.left;
                    } else {
                        tempNode.right = new TreeNode(nums[i], null, null);
                        tempNode = tempNode.right;
                    }


                }

            }


        }*/










    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {

        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode lef, TreeNode right) {
            this.val = val;
            this.left = lef;
            this.right= right;
        }
    }


    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        TreeNode resultNode = sortedArrayToBST(nums);
        System.out.println(resultNode.toString());
    }
}


