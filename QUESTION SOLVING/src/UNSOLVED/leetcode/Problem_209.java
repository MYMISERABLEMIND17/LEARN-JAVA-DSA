package UNSOLVED.leetcode;

public class Problem_209 {
    public static void main(String[] args) {
        int target = 30 ;
        int[] nums = {1,1,1,1,1,1,1,1,1} ;

        System.out.println(logic(nums , target));

    }
    static int logic(int[] nums , int target){
        int minlen = nums.length ;
        for (int i = 0; i < nums.length; i++) {
            int sum= 0 ;
            int len = 0 ;
            for (int j = i; j < nums.length ; j++) {
                sum = sum + nums[j] ;
                len++ ;

            }
            if(sum== target && len < minlen ){
                minlen = len ;
            }
        }
        if(minlen < nums.length){
            return minlen ;
        }
        else {
            return 0 ;
        }

    }
}
