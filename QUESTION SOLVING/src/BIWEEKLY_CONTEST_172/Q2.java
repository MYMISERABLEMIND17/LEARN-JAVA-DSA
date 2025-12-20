package BIWEEKLY_CONTEST_172;

public class Q2 {
    public static void main(String[] args) {
        int[] nums = {8,7,4,3};


        System.out.print(maxSum(nums));
    }

    static int maxSum(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length ; k++) {
                    if( i == j && j != k && i != j && j == k &&i == k && i != j ){
                        continue ;
                    }
                    else{
                        int f = nums[k];
                        int s = nums[j];
                        int t = nums[i];
                        if ((f + s + t) % 3 == 0 && f + s + t > sum) {
                            sum = f + s + t;
                        }    else if (sum == 0 && i == nums.length-1) {
                            return 0;
                        }
                    }

                }

            }
        }

        return sum;
    }

}
