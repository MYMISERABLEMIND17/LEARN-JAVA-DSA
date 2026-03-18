package UNSOLVED.leetcode;

public class Problem_219optimized {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1} ;
        int k = 3 ;

        System.out.println(logic(arr , k ));
    }
    static boolean logic(int[]nums , int k ){
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]  == nums[i+1]){
                return true ;
            }
        }
        return false ;

    }
}
