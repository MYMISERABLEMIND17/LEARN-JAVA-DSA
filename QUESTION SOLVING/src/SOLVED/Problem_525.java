package SOLVED;

import java.util.HashMap;

public class Problem_525 {
    public static void main(String[] args) {
        int[] nums = {0,1} ;
        HashMap<Integer , Integer> map = new HashMap<>() ;
        int sum = 0 ;
        int current  = 0 ;
        int max = 0 ;
        map.put(-1 , 0 ) ;
        for(int i = 0 ; i < nums.length ; i ++ ){
            sum = sum + nums[i] ;
            if(map.containsKey(sum)){
                int val = map.get(sum) ;
                current = i - val ;
                max = Math.max(current , max) ;
            }
            else{
                map.put(sum , i ) ;
            }
        }
        System.out.println(max);






    }
}
