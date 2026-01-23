package SOLVED;

import java.util.Arrays;

public class Problem_977 {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10} ;
        logic(arr);
    }
    static void logic(int[] nums){
        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        // now sort the array
        for (int j = 0; j < nums.length; j++) {
            for (int k = 0; k < nums.length-1-j; k++) {

                if(nums[k] > nums[k+1]){
                    int temp = nums[k] ;
                    nums[k] = nums[k+1] ;
                    nums[k+1] = temp ;
                }
            }

        }
        System.out.println(Arrays.toString(nums));

    }
}
