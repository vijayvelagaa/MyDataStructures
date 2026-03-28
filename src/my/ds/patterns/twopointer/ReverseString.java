package my.ds.patterns.twopointer;

import java.util.Arrays;

public class ReverseString {
    // method 1: creating new Array
    public static String[] reverseString(String[] name)  {

        String[] output = new String[name.length];
        int nameLength = name.length;
        if (nameLength > 0 ) {
           int position = nameLength-1;
           int ind = 0;
           for(int i=position; i>=0; i--) {

               output[ind] = name[i];
               ind++;
           }
        }

        return output;
    }

    // method 2: swapping using two pointer technique
    public static String[] reverseStringWithTwoPointer(String[] name) {

        int left = 0;
        int right = name.length -1;

        for(int i=0; left < right; i++) {
            String temp = name[left];
            name[left] = name[right];
            name[right]= temp;
            left++;
            right --;

        }


        return name;
    }



    public static void main(String[] args) {
        String[] name = {"m", "o", "u", "n", "i"};
        //System.out.println(Arrays.toString(ReverseString.reverseString(name)));
        System.out.println(Arrays.toString(ReverseString.reverseStringWithTwoPointer(name)));
    }

}