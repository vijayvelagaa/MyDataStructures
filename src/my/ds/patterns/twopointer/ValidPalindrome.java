package my.ds.patterns.twopointer;

public class ValidPalindrome {

    public static boolean isPalindrome(String word){

        if(word.isEmpty()) {
            return true;
        }

        int left = 0;
        int right = word.length()-1;

        while(left <= right) {

           char wordStart =  word.charAt(left);
           char wordLast = word.charAt(right);

           if(!Character.isLetterOrDigit(wordStart)) {
               left ++;
           }else if (!Character.isLetterOrDigit(wordLast)){
                right --;
           }else {
               if(Character.toLowerCase(wordStart) != Character.toLowerCase(wordLast)) {
                   return false;
               }

               left ++;
               right --;
           }
        }

        return true;
    }

    public static void main(String[] args) {
       // String s = "A man, a plan, a canal: Panama";
        // String s = " ";
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }
}
