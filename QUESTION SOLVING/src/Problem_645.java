import java.util.Arrays;

public class Problem_645 {
    public static void main (String[] args ) {
        int[] arr = new int[2];
        int[] nums = {2,3,3} ;
        for(int i  = 1 ; i < nums.length ; i++ ){
            System.out.println(i) ;
            if((nums[i-nums[0]] ^ i) ==0){
                continue;

            }

        }
        System.out.println(Arrays.toString(arr) ) ;
    }
}
