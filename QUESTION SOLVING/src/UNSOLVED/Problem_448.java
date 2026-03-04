package UNSOLVED;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem_448 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1} ;
        logic(arr);
    }
    static void logic(int[] nums){
        Arrays.sort(nums);

        ArrayList<Integer> x = new ArrayList<>();
        int expected = 1;
        int i = 0;

        while(expected <= nums.length){

            while(i < nums.length && nums[i] < expected){
                i++;
            }

            if(i < nums.length && nums[i] == expected){
                i++;
            } else {
                x.add(expected);
            }

            expected++;
        }
        System.out.println(x);
    }
}
