import java.util.Arrays;

public class Problem_189 {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,5,6,7 } ;
        int n = 3 ;
        rotate(arr , n );
    }
    static void rotate(int[] nums , int k  ){
            for(int i =0 ; i<k ;i++ ){
                int temp = nums[nums.length -1 ] ;
                for (int j  = nums.length-1; j >0  ; j--) {
                    // time to swap
                    nums[j] = nums[j-1];
                }
                nums[0] = temp ;

            }
            System.out.println(Arrays.toString(nums));
    }

}

