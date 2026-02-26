public class Problem_33 {
    public static void main(String[] args) {
        int[] arr =  {6,7,8,9,1,2,3,4,5 } ;

        System.out.println(logic(arr));
    }
    static  int logic( int[] nums){
        int start = 0  ;
        int end = nums.length-1;
        int target  = 7;
        int mid = start + (end-start)/2 ;
        System.out.println(mid);


        if( target >= nums[start] && target <  nums[mid] && nums[start] < nums[mid]){
            System.out.println(" left sorted ");
            end = mid-1 ;
        }
        else {
            System.out.println("right sorted");
            start = mid+1 ;
        }
        if(target == nums[mid]){
            return mid ;
        }



        while(start <= end ){
            mid = start + (end-start)/2 ;

            if(target == nums[mid]) {
                return mid;
            }
            else if(target > nums[mid]){
                start = mid+1 ;
            } else if (target < nums[mid]) {
                end = mid-1 ;
            }

        }


    return -1 ;
    }
}
