import java.util.Arrays;

public class Problem_66 {
    public static void main(String[] args) {
        int[] digit = {9 ,5,3,9,9} ;
        logic(digit);
    }
    static void logic(int[] nums){
         int count  =0 ;
        for (int i = nums.length-1 ; i >= 0 ; i--) {
            count  = count +1 ;
            System.out.println(nums[i]);
            if(i == nums.length-1){
                nums[nums.length-1] = nums[nums.length-1] + 1  ;
                if(nums[nums.length-1-count] == 10){
                    nums[nums.length-1-count] = 0  ;
                    nums[nums.length-1-count]  = nums[nums.length-1-count] + 1 ;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
