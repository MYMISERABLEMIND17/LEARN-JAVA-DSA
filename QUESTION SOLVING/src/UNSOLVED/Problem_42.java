package UNSOLVED;

public class Problem_42 {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1} ;
        logic(height);
    }
    static void logic(int[] nums){
        int vol = 0 ;
        int j = 0 ;
        int max = 2 ;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > nums[j]){
                j= i ;
            }

            if(nums[i] < nums[j] && nums[i] <= max){
                vol = vol+ (nums[j] - nums[i]) ;
            }
            System.out.println(vol);
//            System.out.println(j);
        }
        System.out.println(vol);
    }
}
