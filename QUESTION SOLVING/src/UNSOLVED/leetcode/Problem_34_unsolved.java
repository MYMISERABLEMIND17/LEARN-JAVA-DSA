package UNSOLVED.leetcode;

import java.util.ArrayList;

public class Problem_34_unsolved {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10} ;
        int target = 8 ;

        System.out.println(logic(arr , target));
    }

    static int[] logic (int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<Integer>() ;
        int[] x = {-1 , -1 } ;
        int start = 0 ;
        int end  = nums.length-1 ;

        while(start <= end ){
            int mid = start + (end-start)/2 ;

            if(nums[mid] == target){
                start = mid ;
            } else if (nums[mid] > target ) {
                end = mid-1 ;
            }
            else {
                start = mid+1 ;
            }


        }
        System.out.println(list);


        return x ;
    }

}
