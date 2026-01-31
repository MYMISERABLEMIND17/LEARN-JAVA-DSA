package UNSOLVED;

import java.util.Arrays;

public class Problem_867 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3} ,{4,5,6} };
        logic(arr);
    }
    static void logic(int[][] nums){
        System.out.println(nums[0].length);

        int[][] finalarr = new int[nums.length][nums[0].length];
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j <nums[i].length ; j++) {
                if(i<j){
//                    finalarr[j][i] = nums[i][j];
//                    int temp = nums[i][j] ;
//                    nums[i][j] = nums[j][i] ;
//                    nums[j][i] = temp ;

                }
            }
        }
        System.out.println(Arrays.deepToString(nums));
    }
}