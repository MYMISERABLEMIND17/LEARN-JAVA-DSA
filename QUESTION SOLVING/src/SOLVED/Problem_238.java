package SOLVED;

import java.util.Arrays;

public class Problem_238 {
    static void main(String[] args) {
        int[] nums = {1,2,3,4} ;


        int[] parr = new int[nums.length] ;
        int[] sarr = new int[nums.length] ;
        int[] ans = new int[ nums.length]  ;



        parr[0] = nums[0] ;
        sarr[nums.length - 1] = nums[nums.length-1] ;
        for (int i = 1; i < nums.length ; i++) {
            parr[i] = nums[i] * parr[i - 1];
            sarr[nums.length - i-1] = sarr[nums.length-i] * nums[nums.length - i-1];
        }

        System.out.println(Arrays.toString(parr));
        System.out.println(Arrays.toString(sarr));


        for (int i = 0; i < nums.length; i++) {
            if(i == 0 ){
                ans[i] = 1 * sarr[i+1] ;
            }
            else if(i == nums.length-1){
                ans[i] = 1* parr[i-1] ;
            }
            else {
                ans[i]  = sarr[i+1] * parr[i-1];
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
