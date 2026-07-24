public class Problem_209 {
    public static void main(String[] args){
        int target = 7 ;
        int[] arr = {2,3,1,2,4,3} ;
        logic(target , arr ) ;

    }
    static int logic(int t , int[] nums){
        int sum = 0 ;
        int left = 0 ;
        int right = 0 ;
        for(int i =0 ; i < nums.length ; i++ ){
            sum  = sum + nums[i] ;
            if(sum >= t ){
                right  = i ;
                break ;
            }
        }
        if (sum < t) {
            return 0;
        }

        int subarr = Integer.MAX_VALUE ;
        System.out.println(sum) ;

        while(right < nums.length){
            if(sum >= t ){
                if(right-left+1 < subarr){
                    subarr = right-left+1 ;
                }
                sum = sum - nums[left] ;
                left++ ;
            }

            else if(sum < t ){
                if (right == nums.length - 1) {
                    break;
                }
                right++ ;
                sum = sum +  nums[right] ;
            }
        }
        return subarr ;

    }
}
