package SOLVED;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1470 {
    public static void main(String[] args) {
        // take input

        Scanner inp = new Scanner(System.in);
        System.out.print("how many elements you want = ");
        int elements = inp.nextInt();

        int[] nums = new int[elements];

        for (int i = 0; i < elements; i++) {
            nums[i] = inp.nextInt();
        }
        System.out.println(Arrays.toString(nums));

//        -------------------------------------------------------------------------------

        int mid = nums.length / 2;
        int[] x = new int[mid];
        int[] y = new int[mid];

        for (int j = 0; j < mid; j++) {
            x[j] = nums[j];
        }
        System.out.println(Arrays.toString(x));
        for (int k = 0; k < mid; k++) {
            y[k] = nums[mid + k];
        }
        System.out.println(Arrays.toString(y));
//---------------------------------------------------------------------------------------------------------------
        // we already create the 2 different arrays

        int[] ans = new int[elements];
        for (int z = 0; z < elements; z++) {
            if (z % 2 == 0) {
                for (int f = 0; f < mid; f++) {
                    x[f] = ans[z];
                }
            } else {
                for (int g = 0; g < mid; g++) {
                    x[g] = ans[z];
                }

            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
