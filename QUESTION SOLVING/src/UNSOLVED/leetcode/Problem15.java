import java.util.ArrayList;
import java.util.List;

public class Problem15 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4} ;
        int target = 0 ;
        int i = 0  ;


        while(i < nums.length-2 ){
            for (int j = i+1; j < nums.length-1 ; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(nums[i] + nums[j] + nums[k] == target ){
                        System.out.println( nums[i] + " " + nums[j] + " " + nums[k] );
                    }
                }
            }
            i++ ;
        }

    }
}
