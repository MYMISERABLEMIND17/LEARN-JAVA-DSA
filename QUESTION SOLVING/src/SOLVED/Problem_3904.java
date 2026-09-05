package SOLVED;

import java.util.Arrays;

public class Problem_3904 {
    static void main(String[] args) {
        int[] nums = {5,0,1,4} ;
        int[] max = new int[nums.length] ;
        int[] min = new int[nums.length] ;


        max[0] = nums[0]  ;
        for(int i =1 ; i < nums.length ; i++ ){
            max[i] = Math.max(nums[i] , max[i-1] ) ;
        }

        min[nums.length-1] = nums[nums.length-1] ;
        for(int i = nums.length-2 ; i >= 0 ; i-- ){
            min[i] = Math.min(nums[i] , min[i+1] ) ;
        }


        System.out.println(Arrays.toString(max));
        System.out.println(Arrays.toString(min));

        for (int i = 0; i < nums.length; i++) {
            if(max[i] == min[i] ){
//                return i ;
            }
        }


    }
}
