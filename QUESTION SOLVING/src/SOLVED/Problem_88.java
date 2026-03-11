package SOLVED;

import java.util.Arrays;

public class Problem_88 {
    public static void main(String[] args) {
        int[] arr1 = {1} ;
        int[] arr2 = {} ;
        int m = arr1.length ;
        int n = arr2.length ;
        logic(arr1, m   ,arr2 , n );
    }
    static void logic(int[] nums1, int m, int[] nums2, int n){
        for (int i = 0; i < nums2.length; i++) {
            nums1[m+ i] = nums2[i] ;
        }

        Arrays.sort(nums1);

    }
}
