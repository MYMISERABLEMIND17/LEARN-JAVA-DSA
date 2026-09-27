package marathon_10hr_prep;

import java.util.Arrays;
import java.util.HashMap;

public class twosum {
    static void main(String[] args) {
        int[] nums = {3,2,4} ;
        int target = 6 ;
        HashMap<Integer,Integer> map = new HashMap<>() ;
        for(int i = 0 ; i < nums.length ; i++ ){
            map.put(nums[i] , map.getOrDefault(nums[i] , i) ) ;
        }
        int[] arr = new int[2] ;
        int count = 0 ;
        for(int i = 0  ; i < nums.length ; i++){
            int num = target - nums[i] ;
            int ind = map.getOrDefault(num , 0 ) ;
            if(map.containsKey(num) && ind != i){
                arr[0] = i ;
                arr[1] = ind ;
                break ;
            }
        }
        System.out.println(map);
        System.out.println(Arrays.toString(arr));
    }


}
