package SOLVED;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("ENTER THE final NUMBERS =");
        int target = inp.nextInt();
        int[] nums = {2, 3, 4, 6, 8, 10};

        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = i+1; j <= nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] out = new int[2];
                    out[0] = i;
                    out[1] = j;
                    System.out.println(Arrays.toString(out));
                }
            }
        }


    }
}
