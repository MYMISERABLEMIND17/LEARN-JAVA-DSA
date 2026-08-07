package SOLVED.leetcode;

public class Problem_1991 {
    public static void main(String[] args) {
        int[] nums = {1,-1,4} ;
        int tsum = 0 ;
        int lsum = 0  ;
        for (int i = 0; i < nums.length; i++) {
            tsum = tsum + nums[i] ;
        }
        System.out.println(tsum);

        int rsum = tsum ;

        int j = 0 ;
        while(j < nums.length) {

            if(j > 0){
                lsum = lsum + nums[j-1] ;
            }

            rsum = rsum - nums[j] ;
            if(lsum == rsum){
                System.out.println(nums[j]);
            }
            j++ ;
        }

    }

}
