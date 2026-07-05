package SOLVED.leetcode;

import java.util.Arrays;

public class Problem_506 {
    public static void main(String[] args) {
        int[] arr = {10,3,8,9,4};
        logic(arr);
    }
    static void logic(int[] nums){
        String[] str = new String[nums.length] ;
        for (int i = 0; i < nums.length; i++) {
            int position = 1 ;
            for(int j = 0 ; j < nums.length ; j++  ){
                if(nums[i] < nums[j]){
                    position++ ;
                }
            }
            if(position == 1){
                str[i] = "Gold Medal" ;
            } else if (position == 2) {
                str[i] = "Silver Medal" ;
            } else if (position == 3 ) {
                str[i] = "Bronze Medal" ;
            }

            else{
                str[i] = position+"" ;
            }
            position = 1 ;
        }
        System.out.println(Arrays.toString(str));

    }
}
