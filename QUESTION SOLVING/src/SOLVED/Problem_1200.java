package SOLVED;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_1200 {
    public static void main(String[] args) {
        int[] arr = {3,8,-10,23,19,-4,-14,27};
        logic(arr) ;
    }
    static void logic(int[] nums){
        // sort the array
//        for (int i = 0; i < nums.length ; i++) {
//            for (int j = i; j < nums.length ; j++) {
//                if(nums[i] > nums[j]){
//                    int temp = nums[i] ;
//                    nums[i] = nums[j] ;
//                    nums[j] = temp ;
//                }
//            }
//        }
        Arrays.sort(nums);

        List<List<Integer>> finall = new ArrayList<>();

        // find the minimum difference
        int ad =  nums[1] -nums[0] ;
        for (int q = 0; q < nums.length-1; q++) {
            int diff = nums[q+1] - nums[q] ;
            List<Integer> number = new ArrayList<>();
            number.add(nums[q]) ;
            number.add(nums[q+1]);
            if(diff < ad ){
                ad = diff ;
                finall.clear();
                finall.add(number) ;

            }
            else if(diff == ad ){
                finall.add(number) ;
            }
        }
        System.out.println(ad);

        System.out.println(finall);

        System.out.println(Arrays.toString(nums));
    }
}
