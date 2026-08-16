package ESD;

public class Problem_alternatesign {
    public static void main(String[] args) {
        int[] nums = {1, -1, -1, 2, 4, -5};

        int i = 0;
        int even = 0;
        int odd = 1;

        while (i < nums.length) {

            // correct positive at even index
            if (nums[i] > 0 && i % 2 == 0) {
                even = i + 2;
                i++;
            }

            // correct negative at odd index
            else if (nums[i] < 0 && i % 2 != 0) {
                odd = i + 2;
                i++;
            }

            // negative found at even index → swap with a positive at an odd index
            else if (nums[i] < 0 && i % 2 == 0) {

                while (odd < nums.length && nums[odd] < 0) {
                    odd += 2;
                }

                if (odd < nums.length) {
                    int temp = nums[i];
                    nums[i] = nums[odd];
                    nums[odd] = temp;
                }

                i++;
            }

            // positive found at odd index → swap with a negative at an even index
            else if (nums[i] > 0 && i % 2 != 0) {

                while (even < nums.length && nums[even] > 0) {
                    even += 2;
                }

                if (even < nums.length) {
                    int temp = nums[i];
                    nums[i] = nums[even];
                    nums[even] = temp;
                }

                i++;
            }
        }

        // print result
        for (int x : nums) {
            System.out.print(x + " ");
        }
    }
}