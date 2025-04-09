package my.ds.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PascalTriangle {

    public static List<List<Integer>> createPascalTriangle(int row) {



        if(row == 0) {
            return new ArrayList<>();
        }
        if(row ==1) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(List.of(1));
            return result;
        }

        List<List<Integer>> previous = createPascalTriangle(row-1);
        List<Integer> current = new ArrayList<>();

        for(int i=0; i<row; i++) {
            current.add(1);
        }


        for(int i=1; i < row-1; i++) {
            current.set(i, previous.get(row-2).get(i-1) + previous.get(row-2).get(i));
        }
        previous.add(current);

        return previous;

    }


    public static void main(String[] args) {
        List<List<Integer>> result = createPascalTriangle(5);
        System.out.println(result);
    }
}
