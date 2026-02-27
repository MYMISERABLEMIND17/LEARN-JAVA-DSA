public class Problem_33 {
    public static void main(String[] args) {
        int[] arr =  {6,7,8,9,1,2,3,4,5 } ;
        int target = 7 ;
        System.out.println(logic(arr , target ));
    }
    static  int logic( int[] nums , int target){

        int start = 0 ;
        int end = nums.length-1;

        while(start <= end){

            int mid = start + (end-start)/2 ;

            if(nums[mid] == target){
                return mid ;
            }

            if(nums[start] <= nums[mid]){

                if ( target >= nums[start]  &&  target < nums[mid] ){
                    end = mid -1 ;
                }
                else {
                    start = mid+1 ;
                }
            }
//            else (nums[mid] < nums[end]){
            else{
                if(target > nums[mid] && target <= nums[end]){
                    start = mid + 1 ;
                }
                else {
                    end = mid -1 ;
                }
            }

        }
    return -1 ;
    }
}
