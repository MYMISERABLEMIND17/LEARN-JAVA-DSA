package UNSOLVED;

import java.util.Arrays;

public class Problem_73 {
    public static void main(String[] args) {
        int[][] arr = {{1,0,5,9} ,{5,5,5,4} , {4,2,1,6} ,{3,5,1,0}} ;
        logic(arr);
    }
    static void logic (int[][] nums ){
        //detect the zero
        boolean[] rowZero = new boolean[nums.length];
        boolean[] colZero = new boolean[nums[0].length];

        for (int i = 0; i < nums.length ; i++) {


            for (int j = 0; j < nums[i].length; j++) {
                if(nums[i][j] == 0 ){
                    rowZero[i] = true ;
                    colZero[j] = true;
                }
            }
        }

        // zeros all the elements
        for (int p = 0; p < nums.length; p++) {
            for (int q = 0; q < nums[p].length; q++) {
                if( rowZero[p] || colZero[q] ){
                    nums[p][q] = 0 ;
                }
            }
        }

        System.out.println(Arrays.deepToString(nums));

    }
}
