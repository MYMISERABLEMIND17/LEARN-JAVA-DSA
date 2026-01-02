package UNSOLVED;

import java.util.Arrays;

public class Problem_34_unsolved {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10} ;
        int target = 7 ;

        System.out.println(logic(arr , target));
        System.out.println(Arrays.toString(logic(arr , target)));
    }

    static int[] logic (int[] nums, int target) {
        int start = 0 ;
        int end = nums.length-1 ;
        while(start <=end ){
            int mid = start + (end-start)/2 ;
            if(nums[start] == target && nums[end] == target){
                return new int[] { start , end } ;
            }
            else if(nums[mid] > target){
                start = mid + 1  ;
            }
            else if (nums[mid] <target) {
                end = mid -1 ;
            }

        }

        return new int[]{7} ;
    }
}
