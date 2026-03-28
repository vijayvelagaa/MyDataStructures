package my.ds.patterns.twopointer;

import my.ds.Array.Array;

public class FindFirstPalindromicStringInArray {

    // My Solution it took 2 ms and memory 47.49 MB
//    public String firstPalindrome(String[] words) {
//
//        if(words.length == 0) {
//            return "";
//        }
//
//        boolean firstPalindrome = true;
//        String wordPalindrome = "";
//        for(String word :  words) {
//            firstPalindrome = true;
//
//            if (word.isEmpty()){
//                continue;
//            }
//
//            int left = 0;
//            int right = word.length() - 1;
//            while(left <= right) {
//                char leftSideChar = word.charAt(left);
//                char rightSideChar = word.charAt(right);
//
//                if (leftSideChar != rightSideChar) {
//                    firstPalindrome = false;
//                    break;
//                } else {
//                    left ++;
//                    right --;
//                }
//            }
//
//            if (firstPalindrome) {
//                wordPalindrome = word;
//                break;
//            }
//
//        }
//
//        return wordPalindrome;
//
//    }

    // Optimal Solution
    public static String firstPalindrome(String[] words) {

       for(String word : words) {
           if(isPalindrome(word)) {
               return word;
           }
       }

        return "";
    }

    public static boolean isPalindrome(String word) {

        int left = 0;
        int right = word.length() -1;

        while(left< right){

            if(word.charAt(left) != word.charAt(right)) {
                return false;
            }
                left ++;
                right --;

        }

        return true;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }

}
