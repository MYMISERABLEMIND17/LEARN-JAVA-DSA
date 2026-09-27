import java.util.HashMap;

public class Problem_2461 {
    public static void main(String[] args) {

        HashMap<Integer , Integer> map = new HashMap<>() ;
        int[] nums = {1,5,4,2,9,9,9,} ;
        int  k = 3  ;

        int sum = 0 ;
        int maxsum = 0  ;
        for (int i = 0; i < k; i++) {
            int num = nums[i] ;
            map.put(num , map.getOrDefault(num , 0 ) +1 ) ;
            sum += nums[i] ;
        }
        System.out.println(sum);
        int end =  k-1 ;
        int start = 0 ;

        while (end  < nums.length){
            int ns = nums[start] ;

            // check the size
            if(map.size() == k ) {
                maxsum = Math.max(maxsum , sum) ;
            }

            map.put( ns , map.getOrDefault(ns , 0 ) -1 )  ;
            int val = map.getOrDefault(ns , 0) ;
            if(val == 0 ){
                map.remove(ns) ;
            }
            sum = sum - ns ;
            start++ ;
            end++ ;
            if (end < nums.length) {
                int ne = nums[end];       // ✅ FIXED

                sum += ne;
                map.put(ne, map.getOrDefault(ne, 0) + 1);
            }
        }

        System.out.println(maxsum);

    }
}
