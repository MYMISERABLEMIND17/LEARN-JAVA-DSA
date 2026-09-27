package SOLVED;

import java.util.Arrays;

public class Problem_1109 {
    public static void main() {
        int[][] nums = {{1,2,10},{2,2,15}} ;  int  n = 2;
        int[] arr = new int [n] ;

        for (int i = 0 ; i < nums.length ; i++ ){
            int st = nums[i][0] -1 ;
            int en = nums[i][1] -1 ;
            int seats = nums[i][2] ;


            arr[st] += seats  ;

            if(en+1 < nums.length){
                arr[en+1] -= seats  ;
            }





        }
        int sum = 0  ;
////          now apply the prefix sum ;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]  ;
            arr[i] = sum ;
        }


        System.out.println(Arrays.deepToString(nums));
        System.out.println(Arrays.toString(arr));
    }
}
