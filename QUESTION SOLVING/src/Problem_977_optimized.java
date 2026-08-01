import java.util.Arrays;

public class Problem_977_optimized {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11} ;
        int[] arr = new int[nums.length] ;

        // first squear all the number
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = nums[i] * nums[i] ;
        }
        System.out.println(Arrays.toString(nums)) ;



    }
}
