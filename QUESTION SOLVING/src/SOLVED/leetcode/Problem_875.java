package SOLVED.leetcode;

import java.util.Arrays;

public class Problem_875 {
    public static void main(String[] args) {
        int[] arr  = {3,6,7,11} ;
        int h = 8 ;

        System.out.println(logic(arr , h ));
    }
    static int logic (int[] nums , int h){
        Arrays.sort(nums);
        int start = 1 ;
        int end  = nums[nums.length-1];
        while(start <= end ){
            int mid  = start  + (end - start)/2 ;
            long  sum = 0 ;
            int i = 0 ;
            while( i < nums.length){
                long div = (nums[i] / mid) ;
                if(nums[i] % mid ==0  ){
                     div = ((long)nums[i] / mid) ;
                }
                else{
                     div = (nums[i] / mid)+1 ;
                }

                sum = sum + div ;
                i++ ;
            }

            if(sum == h){
                end  = mid -1 ;
            } else if ( sum > h ) {
                start = mid +1 ;
            }
            else{
                end = mid -1 ;
            }

        }

        return start ;



    }
}
