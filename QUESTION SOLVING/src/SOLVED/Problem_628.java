package SOLVED;

import java.util.Arrays;

public class Problem_628 {
    public static void main(String[] args) {
        int[] nums = {-100,-98,-1,2,3,4};
        product(nums);
    }

    static void  product(int[] nums) {
        if (nums.length < 3) {
            return ;
        } else {
            // sort the array
            for (int i = 0; i < nums.length; i++) {
                int min = i;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[min] < nums[j]) {
                        min = j;
                    }
                }
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;

            }
            System.out.println(Arrays.toString(nums));
            int prod1 = nums[0] * nums[1] * nums[2];

            int prod3 = nums[nums.length - 1] * nums[nums.length - 2] * nums[0];

            int max = 0 ;
            if ( prod1 > prod3 ) {
                max =  prod1;
            }
            else if (prod3 > prod1 ) {
                max = prod3;
            }
            Math.max(prod1 , prod3) ;
            System.out.println(max);
        }

    }

}