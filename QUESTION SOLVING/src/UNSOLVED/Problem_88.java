package UNSOLVED;

import java.util.Arrays;

public class Problem_88 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0} ;
        int[] arr2 = {4,5,6} ;
        logic(arr1  ,arr2);
    }
    static void logic(int[] nums1 , int[] nums2){
        int n = nums2.length ;
        int m = nums1.length-n ;

        for (int i = 0; i < n; i++) {
            int number = nums2[i];
            for (int j = m-1; j>0 ; j--) {
                if(number < nums1[j]){
                    // swap
                    nums1[j+1] = nums1[j] ;
                    continue;
                }
                else if (number > nums1[j]) {
                    nums1[j+1] = number ;
                    break ;
                }
            }
        }
        System.out.println(Arrays.toString(nums1));

    }
}
