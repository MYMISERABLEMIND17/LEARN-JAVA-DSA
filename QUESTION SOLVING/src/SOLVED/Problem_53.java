package SOLVED;

public class Problem_53 {
    public static void main(String[] args) {
        int[]  nums = {-5,-4,-1,7,8} ;

        System.out.println(logic(nums));
    }
    static int logic(int[] nums){
        int currentsum = 0 ;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currentsum = currentsum+ nums[i] ;


            if(currentsum > maxsum){
                maxsum = currentsum ;
            }
            if(currentsum <0 ){
                currentsum = 0 ;
            }

        }
        return maxsum ;
    }
}
