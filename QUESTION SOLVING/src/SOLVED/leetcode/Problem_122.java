package SOLVED.leetcode;

public class Problem_122 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 1, 5} ;
        logic(arr);
    }
    static void logic (int[] nums ){
        int i = 0 ;
        int j = 0  ;
        int profit = 0  ;
        while( i < nums.length){
            if(nums[i] > nums[j] ){
                profit = profit +(nums[i] - nums[j]) ;
                j = i ;
            }
            else if( nums[i] < nums[j]) {
                j = i ;

            }
            i++ ;
        }
        System.out.println(profit);
    }
}
