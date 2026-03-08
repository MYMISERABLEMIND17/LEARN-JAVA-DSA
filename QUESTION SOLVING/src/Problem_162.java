public class Problem_162 {
    public static void main(String[] args) {
        int[] arr  =  {1} ;
        System.out.println(logic(arr));
    }
    static int logic(int[] nums ){

            int start = 0  ;
            int end = nums.length-1;
            if(start == end ){
                return start ;
            }
            while(start <= end) {
                int mid = start + (end - start )/2  ;
                if(mid == nums.length-1){
                    if( nums[mid] > nums[mid-1]){
                        return mid ;
                    }
                }
                else if (mid == 0) {
                    if(nums[mid] > nums[mid+1]){
                        return mid ;
                    }
                }

                if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]){
                    return mid ;
                }


                if(nums[mid] < nums[mid+1]){
                    start = mid+1 ;
                }
                else {
                    end = mid-1 ;
                }
            }
            return -1 ;
    }
}
