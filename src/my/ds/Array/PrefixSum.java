package my.ds.Array;

import java.util.Arrays;

public class PrefixSum {

    public static int[] computePrefix(int[] numArr) {

        int n = numArr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = numArr[0];
        for(int i=1; i<numArr.length; i++) {
            prefixSum[i] = prefixSum[i-1] + numArr[i];

        }

        //System.out.println(Arrays.toString(prefixSum));
    return prefixSum;
    }

    public static int getRangeSum(int[] prefixSum, int L, int R) {

    if(L==0)
        return prefixSum[R];
        return prefixSum[R] - prefixSum[L-1];

    }




    public static void main(String[] ar) {


        int[] numArr = {2,4,6,8,10};
        int[] prefixSum = PrefixSum.computePrefix(numArr);
        System.out.println(PrefixSum.getRangeSum(prefixSum,1,3));

    }

}
