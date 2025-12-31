import java.util.Arrays;

public class Problem_34 {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10} ;
        int target = 7 ;

        System.out.println(logic(arr , target));
        System.out.println(Arrays.toString(logic(arr , target)));
    }

    static int[] logic (int[] nums, int target) {

        for (int i = 0; i < nums.length-1 ; i++) {
            int start = 0 ;
            int end = nums.length-1 ;
            if(nums[start] == target && nums[end] == target){
                return new int[] {start , end };
            }
            else if(target > nums[start] ){
                start = start + 1 ;
            }
            else if (target < nums[end]) {
                end = end -1 ;
            }
        }
        return new int[]{-1,-1} ;
    }
}
