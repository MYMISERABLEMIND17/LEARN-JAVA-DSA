package SOLVED;

import java.util.HashMap;

public class Problem_347 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3} ;
        int k = 2 ;
        logic(arr , k );
    }
    static void logic(int[] nums , int k ){
        int[] ans = new int[k] ;
        HashMap<Integer , Integer> mymap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentCount = mymap.getOrDefault(nums[i], 0);
            int newCount = currentCount + 1;
            mymap.put(nums[i] , newCount) ;
        }
        for (int value : mymap.values()) {
            System.out.println(value);
        }

        System.out.println(mymap);
    }
}
