package my.ds.Array;

public class Array {



    int[] values = {10, 20, 30, 40, 50, 60, 80, 90, 102, 110, 220, 230, 280, 310, 350, 390};





    public  int getTargetValueFromlist(int target) {
        int left = 0;
        int right = values.length-1;
        while (left <= right) {

            int mid = left + (right - left) / 2;
    System.out.println("MID>>" +mid);
            if (values[mid] == target) {
                return values[mid];
            }else if(values[mid] < target) {
                left = mid+1;
            }else {
                right = mid-1;
            }


        }
        return -1;
    }


    public static void main(String[] ar) {


   System.out.println(new Array().getTargetValueFromlist(80));




}
}
