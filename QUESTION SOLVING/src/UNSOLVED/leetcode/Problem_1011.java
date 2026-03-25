package UNSOLVED.leetcode;

public class Problem_1011 {
    public static void main(String[]args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5 ;
        logic(weights , days) ;
    }
    static void logic (int[] nums , int days){
        int maxrange = 0 ;
        int maxcap = nums[0] ;
        int mid  = 0 ;
        for (int i = 0; i < nums.length ; i++) {
            maxrange = maxrange + nums[i] ;
            if(nums[i] > maxcap){
                maxcap = nums[i];
            }
        }


        int end   = maxrange;
        int start = maxcap ;
        int count =  0 ;

        while( start <= end ){
            mid = start + (end - start )/2 ;
            count = 1 ;
            int sum = 0 ;
            int i = 0 ;
            while( i < nums.length){
                sum = sum + nums[i] ;
                if( sum > mid){
                    count++;
                    sum = 0 ;
                }
                else{
                    i++;
                }
            }


            if( count  > days){
                end = mid -1 ;
            }
            else {
                start = mid +1 ;
            }

            System.out.println(mid);
        }

        System.out.println(count);


    }
}
