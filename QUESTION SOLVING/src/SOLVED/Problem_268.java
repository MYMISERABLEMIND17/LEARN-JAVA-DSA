package SOLVED;

public class Problem_268 {
    public static void main(String[] args) {
        int[] arr = {0, 1 } ;
        logic(arr);
    }
    static void  logic(int[] nums) {
        int arrsum = nums.length;
        int valsum = 0 ;
        for (int i = 0; i <= nums.length-1 ; i++) {
            arrsum =  arrsum + i ;
            valsum = valsum + nums[i] ;
        }
        int ans = arrsum - valsum ;
        System.out.println(ans) ;



    }
}