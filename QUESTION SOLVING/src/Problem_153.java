public class Problem_153 {
    public static void main(String[] args) {
        int[] arr = {11,13,15,17};
        logic(arr);
    }
    static int logic(int[] nums){
        int min = nums[0] ;

        int start = 0 ;
        int end = nums.length-1 ;


        while(start <= end ){
            int mid  =  start + (end- start )/2 ;

            if( nums[mid] <  min ){
                int temp = min ;
                min = nums[mid] ;
            }

            else if( nums[mid] > nums[end]){
                start = mid+1 ;
            }
            else  {
                end = mid-1;
            }



        }
        return min ;

    }
}
