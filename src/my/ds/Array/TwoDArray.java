package my.ds.Array;

public class TwoDArray {

    public static void main(String[] args) {

        int [] [] lottery = new int [3] [3];
        lottery [0] [0] = 1;
        lottery [0] [1] = 2;

        int [] [] lottery1 = {{1, 2}, {4, 5}, {7, 8}};

       // System.out.println(lottery1.length);
        for(int row=0; row<lottery1.length; row++) {
            for(int column=0; column<lottery1[row].length; column++) {
               System.out.print(lottery1 [row] [column]);
            }
        }

       // System.out.println(lottery1[0][0]);
      //  System.out.println("------------");

        for(int row=0; row<3; row++) {

//                System.out.print(lottery1 [row] [row]);

        }





    }
}
