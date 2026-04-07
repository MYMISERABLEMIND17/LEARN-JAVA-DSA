package SOLVED.leetcode;

import java.util.Arrays;

public class Problem_34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10} ;
        int target = 8 ;
        logic(nums , target);
    }
    static void logic (int[] nums, int target){
        int start = 0 ;
        int end = nums.length -1 ;
        int[] ans = {-1 , -1} ;


        while(start <= end) {
            int mid = start + (end - start)/2 ;
            if(nums[mid] == target ){
                ans[0] = mid ;
                ans[1] = mid ;
                end = mid -1 ;
            }
            else if(nums[mid] > target){
                end = mid -1 ;
            }
            else {
                start = mid+1 ;
            }
        }

        int start1 = 0 ;
        int end1 = nums.length -1 ;

        while(start1 <= end1) {
            int mid = start1 + (end1 - start1)/2 ;
            if(nums[mid] == target ){

                ans[1] = mid ;
                start1  = mid  + 1 ;


            }
            else if(nums[mid] > target){
                end1 = mid -1 ;
            }
            else {
                start1 = mid+1 ;
            }
        }



        System.out.println(Arrays.toString(ans));


    }
}
