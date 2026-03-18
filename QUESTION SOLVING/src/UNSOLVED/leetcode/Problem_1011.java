package UNSOLVED.leetcode;

public class Problem_1011 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4} ;
        System.out.println(logic(arr));
    }
    static int logic(int[] nums){

        int  start = 0  ;
        int end = nums.length-1 ;
        int mid  = start +  (end-start)/2 ;
        while(start < end ){
             mid  = start +  (end-start)/2 ;


            if(nums[mid] < nums[mid+1]){
                start = mid+ 1 ;
            }
            else {
                end = mid  ;
            }

        }

        return mid  ;

    }
}
