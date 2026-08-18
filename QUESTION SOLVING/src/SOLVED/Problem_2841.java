package SOLVED;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Problem_2841 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 6, 7, 3, 1, 7));
        int m = 3 ;
        int k = 4 ;

        int sum = 0 ;
        int maxsum  = 0 ;

        HashMap<Integer , Integer > x = new HashMap<>() ;
        // isko 0 to k-1 => window size , rkho ;
        for (int i = 0; i < k ;  i++) {
            x.put(nums.get(i) , x.getOrDefault(nums.get(i) , 0 )+1 ) ;
            sum = sum + nums.get(i) ;
        }

        int start = 0 ;
        int end = k-1 ;
        while(end < nums.size()){
            if(x.size() >= m && sum > maxsum){
                maxsum = sum ;
            }
            if(x.get(nums.get(start)) == 1 ){
                x.remove(nums.get(start)) ;
            }else {
                x.put(nums.get(start) , x.get(nums.get(start)) -1 );
            }

            sum = sum - nums.get(start) ;
            start++ ;
            end++ ;
            if(end < nums.size()){
                x.put(nums.get(end),x.getOrDefault(nums.get(end) , 0 ) +1 ) ;
                sum = sum + nums.get(end) ;
            }


        }

        System.out.println(maxsum);


    }
}
