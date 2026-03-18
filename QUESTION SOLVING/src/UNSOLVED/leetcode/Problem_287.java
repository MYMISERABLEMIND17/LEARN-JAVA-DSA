package UNSOLVED.leetcode;

public class Problem_287 {

    // brut force
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2} ;
        System.out.println(logic(arr));
    }
    static int  logic(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i] == nums[j]){
                    return nums[j] ;
                }
            }
        }

        return -1  ;

    }
}
