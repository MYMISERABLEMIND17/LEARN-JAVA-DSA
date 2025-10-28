package lect1.Array;

import java.util.Arrays;

public class PassingByReference {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,7} ;
        System.out.println(Arrays.toString(nums));
        change(nums) ;// this will change the value ,bcoz they both are pointing toward the same variable
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr){
        arr[0] =99 ;
    }
}
