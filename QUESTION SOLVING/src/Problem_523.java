
import java.util.Arrays;
import java.util.HashMap;

public class Problem_523 {
    public static void main(String[] args) {
        int k = 6 ;
        int[] nums = {23,2,6,4,7} ;
        HashMap<Integer , Integer> map = new HashMap<>() ;

        int sum = 0 ;
        for (int i = 0; i < nums.length; i++) {
            sum = sum  + nums[i] ;
            int n = sum % 6 ;
            if(map.containsKey(n)){
                int val = map.get(n) ;
                if(i - val >=2){
                    System.out.println(true);
                }
            }
            else{
                map.put(n , i) ;
            }

        }

    }
}
