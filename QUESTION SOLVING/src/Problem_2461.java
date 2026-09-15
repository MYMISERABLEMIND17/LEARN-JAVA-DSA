import java.util.HashMap;

public class Problem_2461 {
    public static void main(String[] args) {


        int[] nums = {1,1,2,3,4} ;
        int  k = 3  ;
        long maxsum = 0 ;
        long  sum =  0 ;
        HashMap<Integer , Integer> map = new HashMap<>() ;
        int start =  0 ;
        int end  = k -1 ;

        for (int i = 0; i <= end; i++) {
            map.put(nums[i] , map.getOrDefault(nums[i] , 0 ) +1  ) ;
            sum = sum + nums[i] ;
        }
        int count  = 0 ;

        while(end  < nums.length-1 ){
            if(map.size() == k ){
                count++ ;
                maxsum = Math.max(sum , maxsum) ;
            }

            map.put(nums[start] , map.getOrDefault(nums[start] , 0 )  - 1 ) ;
            int freq = map.getOrDefault(nums[start] , 0) ;
            if(freq == 0  ){
                map.remove(nums[start]) ;
            }
            sum -= nums[start] ;
            start++  ;
            end++ ;
            sum += nums[end] ;
            map.put(nums[end] , map.getOrDefault(nums[end] , 0 ) + 1 ) ;
        }

        System.out.println(maxsum);
    }
}
