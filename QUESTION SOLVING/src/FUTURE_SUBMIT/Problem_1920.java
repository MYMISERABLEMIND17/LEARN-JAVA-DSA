package FUTURE_SUBMIT;

import java.util.Arrays;

public class Problem_1920 {
    public static void main(String[] args) {
        int[] arr = {5,0,1,2,3,4} ;
        logic(arr );
    }
    static void logic(int[] nums ){
        int[] arr = new int[nums.length] ;

        for (int i = 0; i < nums.length  ; i++) {
            arr[i] = nums[nums[i]] ;
        }
        System.out.println(Arrays.toString(arr ));
    }
}
