import java.util.HashMap;

public class Problem_128 {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1} ;
        HashMap<Integer , Integer> map = new HashMap<>() ;

        for(int i = 0 ; i < nums.length ; i ++ ){
            int  a  = nums[i] ;
            map.put(a , map.getOrDefault(a , 0 ) +1 ) ;
        }
        int maxcount= 0 ;
        int count = 1 ;


        for(int i  = 0 ; i < nums.length ; i ++){
            int current  = nums[i] ;
            if(map.containsKey(current + 1 )){
                count++ ;
            }
        }

        System.out.println(count);

    }
}
