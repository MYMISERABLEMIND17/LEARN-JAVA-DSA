import java.util.Arrays;

public class Problem_611 {
    public static void main(String[] args) {

        int[] nums = {2, 2, 3, 4};
        int count = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length ; i++) {
            int left = 0 ;
            int right  = i-1 ;

            while(left < right){
                if((nums[left] + nums[right]) > nums[i]){
                    count += right - left;
                    right-- ;
                }
                else{
                    left++ ;
                }
            }
        }
        System.out.println(count);
    }
}
