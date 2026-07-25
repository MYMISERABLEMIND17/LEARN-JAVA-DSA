package SOLVED.leetcode;

import java.util.Arrays;

public class Problem_724 {
    public static void main(String[] args ){
        int[] nums = {1,7,3,6,5,6};
        logic(nums) ;
    }
    static int logic(int[] nums ){
        int[] ltor = new int[nums.length] ;
        int[] rtol = new int[nums.length] ;
        ltor[0] = nums[0] ;
        rtol[nums.length-1] = nums[nums.length-1] ;
        for(int i = 1 ; i < nums.length ; i++){
            // for ltor
            ltor[i] = ltor[i-1] + nums[i] ;

            // for rtol
            rtol[nums.length-1-i] = rtol[nums.length-i] + nums[nums.length-1-i] ;

        }

        System.out.println(Arrays.toString(ltor)) ;
        System.out.print(Arrays.toString(rtol)) ;

        for(int j = 0 ; j < nums.length ; j++ ){
            if(ltor[j] == rtol[j]){
                return  j ;
            }
        }
        return -1 ;

    }
}
