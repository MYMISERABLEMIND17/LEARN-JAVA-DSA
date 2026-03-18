package SOLVED.leetcode;

public class Problem_852 {
    public static void main(String[] args) {
        int[] arr = {0,1,0} ;
        System.out.println(logic(arr));
    }
    static int logic(int[] nums){
        int start = 0 ;
        int end = nums.length-1  ;

        while(start <= end ){
            int mid = start + (end - start)/2 ;

            if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]){
                return mid ;
            }

            if(nums[mid] < nums[mid+1] ){
                start= mid +1 ;
            }
            else {
                end = mid -1 ;
            }


        }

        return -1 ;
    }
}
