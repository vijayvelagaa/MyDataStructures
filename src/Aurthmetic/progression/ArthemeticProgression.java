package Aurthmetic.progression;

import java.util.Arrays;

public class ArthemeticProgression {

    static boolean checkIsAP(int arr[], int n) {

        Arrays.sort(arr);

        int d = arr[1] - arr[0];


        for(int i=2; i<n; i++) {
            if(arr[i]-arr[i-1] !=d) {
                return false;
            }


        }

        return true;

    }



    public static void main(String[] args) {
        int ap[] = {1,4,7,10};

        System.out.println(checkIsAP(ap,ap.length));
    }
}
