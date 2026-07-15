package SOLVED;

public class Problem_1343 {
    public static void main(String[] args){
        int[] arr = {2,2,2,2,5,5,5,8} ;
        int q = 3 ;
        int threshold = 4 ;
        logic(arr , q , threshold) ;
    }
    static void logic(int[] nums , int k , int th ){
        int sum = 0  ;
        int count = 0 ;

        for(int i  = 0 ; i < k ; i++){
            sum = sum + nums[i] ;
        }
        int avg = sum/k ;
        if(avg >= th){
            count++ ;
        }

        int left = 0 ;
        int right = k ;
        while(right < nums.length-1 ){
            right  = k + left  ;
            sum  = sum  - nums[left]  + nums[right] ;
            avg  = sum/k ;
            if(avg >= th){
                count++ ;
            }
            left++ ;
        }
        System.out.println(count) ;
    }
}
