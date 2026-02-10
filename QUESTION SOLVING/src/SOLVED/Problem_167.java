package SOLVED;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem_167{
    public static void main(String[] args) {
        int[] numbers = {-1,0};
        int target = -1 ;
        logic(numbers , target);
    }
    static void logic(int[] nums, int target){
        ArrayList<Integer> list = new ArrayList();
        int i = 0 ;
        int j = nums.length-1;
        int sum = -1000 ;
        while(sum != target){

            if(nums[i] + nums[j] > target){
                j-- ;
            }
            else if (nums[i] + nums[j] < target) {
                i++ ;
            }


            if(nums[i]+nums[j] == target){
                sum = nums[i]+nums[j];
                list.add(i+1);
                list.add(j+1);
            }

        }
        int[] arr = new int[list.size()];

        for (int k = 0; k < list.size(); k++) {
            arr[k] = list.get(k);
        }


        System.out.println(Arrays.toString(arr));
    }
}
