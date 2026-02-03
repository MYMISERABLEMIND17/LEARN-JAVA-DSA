package UNSOLVED;

public class Problem_1984 {
    public static void main(String[] args) {
        int[] arr = {9,4,1,7} ;
        int k = 2 ;
        logic(arr , k );
    }
    static void logic(int[] nums , int k ){
        int count  = 0 ;
        for (int i = 0; i < nums.length ; i++) {

            for (int j = i+1; j < nums.length ; j++) {
                if(nums[i] - nums[j] == k || nums[i] - nums[j] == -k ) {
                    count ++ ;
                }
            }
        }
        System.out.println(count);
    }
}
