package SOLVED;

import java.util.Arrays;

public class Problem_1470 {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7} ;
        logic(arr);
    }
    static void logic(int[] nums){
        int[] newarr = new int[nums.length] ;
        int x  = 0 ;
        int y = nums.length/2 ;
        for (int i = 0; i < nums.length; i++) {
            if(i%2 == 0 ){
                newarr[i] = nums[x] ;
                x++ ;
            }
            if(i%2 != 0 ){
                newarr[i] = nums[y] ;
                y++ ;
            }
        }
        System.out.println(Arrays.toString(newarr));
    }

}
