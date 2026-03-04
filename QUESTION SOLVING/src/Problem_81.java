public class Problem_81 {
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int nums = 2;

        System.out.println(logic(arr , nums)) ;
    }

    static boolean logic(int nums[] , int target ){
        int start = 0 ;
        int end  = nums.length-1 ;



        while(start <=  end ){

            int mid = start + (end-start)/2 ;

            if(nums[mid] == target ){
                return true ;
            }
            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start++ ;
                end-- ;
            }

            else if (nums[start] <= nums[mid]) {
                System.out.println("left sorted ");

                if(target < nums[mid] && target >= nums[start] ){
                    end = mid-1 ;
                }

                else {
                    start = mid+1 ;
                }

            }

            else{
                System.out.println("right sorted");

                if(nums[mid] <= target && target <= nums[end]){
                    start = mid+1 ;
                }

                else {
                    end = mid-1 ;
                }

            }
        }

        return false ;
    }
}