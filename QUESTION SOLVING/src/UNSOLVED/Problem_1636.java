package UNSOLVED;

import java.util.Arrays;

public class Problem_1636 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,3,2} ;
        logic(arr);

    }
    static void logic(int[] nums){
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int min = 0 ;
        int k = 0 ;
        int i = 0 ;
        while(i <= nums.length-1){
            int count = 0 ;
            int j = i+1 ;
            while( j < nums.length-1){
                if(nums[i] == nums[j] ){
                    count++ ;
                }
                if(min > count ){
                    min = count ;
                }
                if(nums[i] != nums[j]){
                    i = j ;
                }
                j++ ;
            }
            System.out.println(count);
        }
    }
}

