public class Problem_704 {
    public static void main(String[] args) {
        int[] arr = {1,5,8,9,10} ;
        int target = 9 ;
        System.out.println(logic(arr , target));
    }
    static int logic(int[] nums , int target  ){
        int start = 0 ;
        int end = nums.length-1 ;
        while(start <= end){
            int mid =  start+ (end-start)/2  ;
            if(target == nums[mid] ){
                return mid ;
            } else if (target>nums[mid]) {
                start = mid + 1 ;
            } else if (target < nums[mid ]) {
                end = mid -1 ;
            }
        }
        return -1 ;
    }
}
