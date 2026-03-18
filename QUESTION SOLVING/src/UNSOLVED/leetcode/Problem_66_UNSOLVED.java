package UNSOLVED.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem_66_UNSOLVED {
    public static void main(String[] args) {
        int[] arr = {9, 9} ;
        System.out.println(plusone(arr));
    }
    static int[] plusone(int[] nums){
        ArrayList<Integer> list = new ArrayList<Integer>() ;
        if(nums[nums.length-1] == 9 ){

            if(nums[0] == 9 ){
                for (int i = nums.length; i >= 0  ; i--) {
                    list.add(nums[i]);
                }
                nums[0] = nums[0]+1 ;
            }
        }

        if(nums[nums.length-1] < 9 ){
            nums[nums.length-1] = nums[nums.length-1]+1 ;
        }

        System.out.println(list);
        System.out.println(Arrays.toString(nums));
        return nums ;
    }
}
