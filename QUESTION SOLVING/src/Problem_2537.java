import java.util.HashMap;

public class Problem_2537 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1} ;
        int k = 10 ;
        HashMap<Integer , Integer> map = new HashMap<>()  ;
        int pair = 0 ;
        int start = 0 ;
        int count  = 0 ;
        int end = 0 ;
        while (end < nums.length){
            int num = nums[end] ;
            if(map.containsKey(num)){
                int val = map.getOrDefault(num , 0 ) ;
                pair = pair +  val ;
                map.put(num , map.getOrDefault(num , 0 ) +1 )  ;


            }
            else {
                map.put(num , map.getOrDefault(num, 0 ) +1 )  ;
            }
            end++ ;
            if(pair >= k ){
                count++ ;
            }
        }
        System.out.println(count);
        int pair2 = 0 ;
        while(start < nums.length) {
            int num = nums[start] ;

            if (map.containsKey(num) ){
                int val = map.getOrDefault(num , 0 ) ;
                if(val == 0 ){
                    map.remove(num) ;
                }
                pair2 = pair2 + val ;
                map.put(num , map.getOrDefault(num , 0 ) -1 ) ;
            }
            else{
                map.put(num , map.getOrDefault(num , 0 ) -1 ) ;
            }
            start++ ;

            if(pair2 < 0 ){
                pair2 = -1 * pair2 ;
            }

            if(pair2 >= k ){
                count++ ;
            }
        }
        System.out.println(count);
    }
}
