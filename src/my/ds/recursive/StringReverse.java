package my.ds.recursive;

public class StringReverse {

    private static StringBuilder sb = new StringBuilder();
    static String reverse(String word, int length) {


        char[] letters = word.toCharArray();
        if(length <1) {
            return "";
        }
        if(length == 1) {
            return sb.append(letters[0]).toString();
        }
        return sb.append (letters[length-1])+reverse(word,length-1);

    }


    public static void main(String[] args) {
        String s = "Vi";
        int length = s.length();
        System.out.println(reverse(s, length));
    }
}
