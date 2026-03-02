package UNSOLVED;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem_448 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 7, 8};
        logic(arr);
    }
    static void logic(int[] nums){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        int i = 0 ;
        int number = 1 ;
        while(i < nums.length){
            if(number < nums[i]){
                list.add(number);
                number++;
            } else if(nums[i] == number){
                i++;
                number++;
            } else {
                i++;
            }
        }

        System.out.println(list);
    }
}
