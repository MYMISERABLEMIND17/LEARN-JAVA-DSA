package UNSOLVED.leetcode;

public class Problem_1011 {
    public static void main(String[]args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10} ;
        int days = 5  ;

        System.out.println(logic(arr , days));
    }
    static int  logic (int[] nums , int days){
        int i = 0  ;
        int end = 0 ;
        int start = 0    ;
        while(i < nums.length){
            end = end + nums[i] ;
            if(nums[i] > start){
                start = nums[i] ;
            }
            i++ ;
        }
        int count = 0 ;
        while (start <= end){
            count = 0 ;
            int mid  = start + (end - start )/2 ;
            int cap = 0  ;
            int j = 0 ;
            while( j< nums.length){
                cap = cap + nums[j] ;

                if(cap == mid ){

                }

            }
            if(count == days ){
                return mid ;
            }
            if(count > days){
                start = mid +1 ;
            }
            else {
                end = mid  -1 ;
            }
        }
        return -1 ;


    }
}
