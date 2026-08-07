public class Problem_238 {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        int[] ans = new int[nums.length];
        int lmul = 1;
        int tmul = 1;
        int nozero = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nozero = nozero * nums[i] ;
            }
            tmul = tmul * nums[i];
        }
        System.out.println(tmul);

        int j = 0;
        while (j < nums.length) {
            if (j > 0) {
                lmul = lmul * nums[j - 1];
            }

            if (nums[j] == 0) {
                ans[j] = nozero;
            } else if (nums[j] != 0) {
                tmul = tmul / nums[j];
                ans[j] = tmul * lmul;

            }

            j++;


        }
    }
}
