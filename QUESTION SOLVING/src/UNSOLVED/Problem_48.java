package UNSOLVED;

import java.util.Arrays;

public class Problem_48 {
    public static void main(String[] args) {
        int[][] matrix  = {{1,2,3} , {4,5,6} , {7,8,9}} ;
        logic(matrix);
    }
    static void logic(int[][] nums ){
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                int temp = nums[i][j] ;
                nums[i][j] = nums[j][i] ;
                nums[j][i] = temp ;
            }
        }

        for (int p = 0 ; p<nums.length ; p++ ){
            for (int q = 0; q < nums.length ; q++) {

            }
        }

        System.out.println(Arrays.deepToString(nums));
    }
}
