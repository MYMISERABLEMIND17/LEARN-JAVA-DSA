import java.util.Arrays;

public class Problem_1331 {
    public static void main(String[] args) {
        int[] arr = {37, 12 ,28,9 ,100} ;
        logic(arr);
    }
    static void logic(int[] nums){
        for (int i = 0; i < nums.length ; i++) {
            int lowest = nums[i]  ;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] < lowest ){
                    lowest = nums[j] ;
                }

            }
            nums[lowest] = lowest ;
        }
        System.out.println(Arrays.toString(nums));

    }
}
