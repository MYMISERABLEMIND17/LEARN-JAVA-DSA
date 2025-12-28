import java.lang.reflect.Array;
import java.util.Arrays;

public class Problem_26 {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,2,4,4,4,4,5,5} ;
        logic(arr);
     }
    static void logic(int[] nums) {
        int count = 0 ;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
                count ++ ;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(count+1);

    }
}


