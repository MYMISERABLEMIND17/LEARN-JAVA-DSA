package SOLVED;

import java.util.Arrays;

public class Problem_283 {
    public static void main(String[] args) {

        int[] arr = {0,1,0,3,12} ;
        logic(arr);

    }
    static void logic(int[] nums) {
        int i = 0 ;
        for (int j = 0; j <nums.length ; j++) {
            if(nums[j] != 0 ){
                int temp = nums[j] ;
                nums[j]  = nums[i] ;
                nums[i] = temp ;

                i++ ;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
