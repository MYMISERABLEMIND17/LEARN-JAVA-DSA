package SOLVED.leetcode;

import java.util.Arrays;

public class Problem_27 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2} ;
        int val = 2 ;
        logic(nums ,val );
    }
    static int logic(int[] nums , int target){
        int count = 0 ;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                count++ ;
                nums[i] = -1 ;
            }
        }

        int[] anss = new int[nums.length-count] ;
        int number = 0 ;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] == -1 ){
                continue;
            }else{
                anss[number] = nums[j] ;
                number++ ;
            }
        }
        for (int k = 0; k < anss.length ; k++) {
            nums[k] = anss[k]  ;
        }

        int ans = nums.length - count ;
        System.out.println(Arrays.toString(anss));
        return ans ;
    }
}
