package SOLVED;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem_496 {
    public static void main(String[] args) {
        int[] arr1 = {4,1,2} ;
        int[] arr2 = {1,3,4,2} ;
        logic(arr1 , arr2) ;
    }
    static int[] logic(int[] nums1 , int nums2[]){
        ArrayList<Integer> x = new ArrayList<Integer>() ;

        for (int i = 0; i < nums1.length ; i++) {
            int pointer = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (j == nums2.length - 1 && nums1[i] == nums2[j]) {
                    nums1[i] = -1 ;
                    x.add(-1);
                }

                if (nums1[i] == nums2[j]) {
                    pointer = j;
                } else if (pointer != -1 && j > pointer && nums2[pointer] < nums2[j]) {
                    nums1[i] = nums2[j] ;
                    x.add(nums2[j]);
                    break;
                }
                if (pointer != -1 && nums2[pointer] > nums2[j] && j == nums2.length - 1) {
                    nums1[i] = -1 ;
                    x.add(-1);
                    break;

                }

            }
        }

        System.out.println(Arrays.toString(nums1));
        return nums1 ;
    }
}
