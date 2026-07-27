package SOLVED.leetcode;

public class Problem_1464 {
    public static void main(String[] args ){
        int[] arr =  {3,4,5,2} ;
        logic(arr) ;
    }
    static void logic(int[] nums){
        int max = Integer.MIN_VALUE ;
        int mul = 0 ;
        int maxi = 0 ;
        int maxj = 0 ;
        for(int i = 0 ; i <= nums.length ; i++ ){
            for(int j = i+1 ; j < nums.length ; j++  ){
                if(nums[i] * nums[j] > max ){
                    max = nums[i] * nums[j] ;
                    if(nums[i] == nums[j]){
                        maxi = i ;
                        maxj  = i ;
                    }else{
                        maxi = i ;
                        maxj  = j ;
                    }
                }

            }
        }
        mul = (nums[maxi]-1) * (nums[maxj]-1) ;
        System.out.println(mul) ;

    }
}
