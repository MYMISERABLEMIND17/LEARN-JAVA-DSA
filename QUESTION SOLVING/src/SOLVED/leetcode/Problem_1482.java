package SOLVED.leetcode;

public class Problem_1482 {
    public static void main(String[] args) {
        int[] bloomDay = {7, 7, 7, 7, 12, 7, 7};
        int m = 2;
        int k = 3;
        logic(bloomDay, m, k);
    }

    static void logic(int[] nums, int boq, int flow) {
        long need = (long) boq * flow;
        if (need > nums.length) {
            System.out.println(-1);
            return;
        }

        int maxnum = Integer.MIN_VALUE;
        int minnum = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxnum) maxnum = nums[i];
            if (nums[i] < minnum) minnum = nums[i];
        }

        while (minnum < maxnum) {
            int mid = minnum + (maxnum - minnum) / 2;
            int bouq = 0;
            int streak = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid) {
                    streak++;
                    if (streak == flow) {
                        bouq++;
                        streak = 0;
                    }
                } else {
                    streak = 0;
                }
            }

            if (bouq < boq) {
                minnum = mid + 1;
            } else {
                maxnum = mid;
            }
        }

        System.out.println(minnum);
    }
}