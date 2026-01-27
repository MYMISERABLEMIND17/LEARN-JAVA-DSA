package UNSOLVED;

import java.util.Arrays;

public class Problem_1331 {
    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12} ;
        logic(arr);
    }
    static void logic(int[] nums){
        int[] rankArr = new int[nums.length];
        Arrays.sort(nums);
        int rank = 1 ;
        for (int i = 0; i < nums.length-1 ; i++) {
            if(nums[i] != nums[i+1]){
                rank++ ;
            }
            rankArr[i] = rank ;
        }
        System.out.println(Arrays.toString(rankArr));
        System.out.println(Arrays.toString(nums));
    }
}
