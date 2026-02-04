package FUTURE_SUBMIT;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem_1389 {
    public static void main(String[] args) {
        int[] nums ={0,1,2,3,4} ;
        int[] index = {0,1,2,2,1} ;
        logic(nums , index) ;
    }
    static void logic(int[] nums , int[] index){
        ArrayList<Integer> outlist = new ArrayList<>();
        int[] finalarr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            outlist.add(index[i],nums[i]);
        }
        for (int j = 0; j < nums.length; j++) {
            finalarr[j] = outlist.get(j) ;
        }

        System.out.println(Arrays.toString(finalarr));
    }
}
