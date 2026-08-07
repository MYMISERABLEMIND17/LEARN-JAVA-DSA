public class Problem_287 {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2 } ;
        // find the max element ;
        int max  = 0 ;
        for(int i = 0  ; i < nums.length  ;  i++){
            if(nums[i] > max) {
                max = nums[i] ;
            }
        }
        System.out.println(max);

        int start = 1 ;
        int end = max ;
        int mid = 0 ;
        while (start <= end ){
            mid = start  + (end - start) /2  ;
            int count  = 0 ;

            for (int j = 0; j < nums.length; j++) {
                if(nums[j] <= mid ){
                    count++ ;
                }
            }
            if(count == mid ){
                start = mid+1   ;
            }else{
                end = mid -1  ;
            }
        }
        System.out.println(mid);


    }
}
