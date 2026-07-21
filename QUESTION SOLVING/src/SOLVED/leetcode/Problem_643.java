package SOLVED.leetcode;

public class Problem_643 {
    public static void main(String[] args ){
        int[] a = {5, 2};
        int b = 1  ;
        logic(a , b ) ;
    }
    static void logic (int[] nums , int k ){

        // first i will calculate the sum of k NUMBERS ;
        float maxavg = Integer.MIN_VALUE ;
        float sum = 0 ;

        for(int p = 0 ; p < k; p++ ){
            sum = sum + nums[p] ;
        }
        System.out.println(sum) ;
        float avg = sum/k ;
        if(nums.length == k ){
//            return avg ;
        }
        maxavg = avg ;
        // now we will add and subtract

        int i = 0 ;

        int j = i+k ;
        while(j < nums.length ){

            sum = sum - nums[i] + nums[j] ;
            avg = sum/k ;
            if(avg > maxavg ){
                maxavg = avg  ;
            }
            i++;
            j = i+k ;
        }
        System.out.print(maxavg) ;
    }
}
