package SOLVED;

import java.util.Arrays;

public class Problem_1502 {
    public static void main(String[] args) {
        int[] arr = {1,2,4};

        System.out.println(logic(arr));
    }
    static boolean logic(int[] nums){
        Arrays.sort(nums);
        boolean x = true    ;
        int a = nums[0] ;
        int d = nums[0] - nums[1] ;
        int n = nums.length ;

        for (int i = 1; i <nums.length ; i++) {
            if(nums[i-1] - nums[i] != d){
                return false ;
            }
        }
        System.out.println(Arrays.toString(nums));
        return x ;
    }
}
