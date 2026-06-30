import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.sort;

public class Problem_15 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4} ;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        logic(nums);
    }
    static  void logic(int[] nums){
        int left = 0 ;
        int right = nums.length-1;


        while(left < right){
            int leftval = nums[left];
            int rightval = nums[right];

            if(leftval < 0 ){
                leftval = leftval*-1 ;
            }

            if(leftval < rightval){
                right = right -1  ;
            }
            else if (rightval < leftval) {
                for (int i = left+1 ; i <= right-1; i++) {
                    if(left-right == nums[i]){
                        int third =  nums[i] ;
                }

                }
            }
        }
    }
}
