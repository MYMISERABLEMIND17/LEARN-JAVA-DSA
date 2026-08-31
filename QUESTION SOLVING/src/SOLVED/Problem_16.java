package SOLVED;

public class Problem_16 {
    public static void main(String[] args) {
        int[] nums = {0,0,0} ;
        int target = 1 ;
        int i = 0 ;
        int closestSum = nums[0] + nums[1] + nums[2] ;
        while (i < nums.length-2) {
            for (int j = i+1; j < nums.length-1 ; j++) {
                for (int k = j+1; k < nums.length ;  k++) {
                    int sum  = nums[i] + nums[j] + nums[k] ;
                    int diff = target - sum;
                    if (diff < 0) diff = -diff;

                    int bestDiff = target - closestSum;
                    if (bestDiff < 0) bestDiff = -bestDiff;

                    if (diff < bestDiff) {
                        closestSum = sum;
                    }
                }
            }
            i++ ;
        }
        System.out.println(closestSum);
    }
}
