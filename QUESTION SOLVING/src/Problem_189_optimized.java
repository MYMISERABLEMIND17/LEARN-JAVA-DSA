import java.util.Arrays;

public class Problem_189_optimized {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7} ;
        int k= 3 ;
        rotate(nums , k );
    }
    static void rotate(int[] nums , int k ){
        int n = nums.length;
        int[] out = new int[n];

        for (int i = 0; i < n; i++) {
            out[(i + k) % n] = nums[i];
        }

        System.out.println(Arrays.toString(out));

    }
}
