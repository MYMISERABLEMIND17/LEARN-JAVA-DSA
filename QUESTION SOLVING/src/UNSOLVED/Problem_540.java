package UNSOLVED;

public class Problem_540 {
    public static void main(String[] args) {
        int[]arr = {1,1,2,2,3} ;
        System.out.println(logic(arr));
    }
    static int logic(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        int mid = -1;

        while(start <= end){
            mid = start + (end - start) / 2;

            if(start == end){
                return nums[start];
            }
            if(mid == 0 && nums[mid] != nums[mid+1]){
                return nums[mid];
            }
            if(mid == nums.length-1 && nums[mid] != nums[mid-1]){
                return nums[mid];
            }
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }

            if(mid % 2 == 0){
                if(nums[mid] == nums[mid+1]){
                    start = mid + 2;
                }
                else {
                    end = mid;
                }
            } else {
                if(nums[mid] == nums[mid-1]) {
                    start = mid + 1 ;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return nums[mid];
    }
}
