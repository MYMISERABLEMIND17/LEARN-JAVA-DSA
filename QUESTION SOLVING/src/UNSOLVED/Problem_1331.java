package UNSOLVED;

import java.util.Arrays;

public class Problem_1331 {
    public static void main(String[] args) {
        int[] arr ={40,10,20,30};
        logic(arr);
    }
    static void logic(int[] nums ){
//        int x = 0 ;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > nums[i-1]){
//
//            }
//        }



        int[] copy = nums.clone() ;
        Arrays.sort(copy);
        System.out.println(Arrays.toString(copy));
    }
}
