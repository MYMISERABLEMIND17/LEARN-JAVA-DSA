package SOLVED;

import java.util.Arrays;

public class Problem_219 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int k = 3 ;

        System.out.println(logic(arr , k ));
    }
    static boolean logic( int[] nums , int k ){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j] && j-i <=k  ){
                    return true ;
                }
                if(j > i+ k ){
                    break ;
                }
            }
        }
        return false ;
    }
}
