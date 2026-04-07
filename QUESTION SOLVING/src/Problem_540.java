public class Problem_540 {
    public static void main(String[] args) {
        int[]arr = {3,3,7,7,10,11,11} ;
        System.out.println(logic(arr));
    }
    static int logic(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        int mid = start + ( end - start )/2 ;

        while (start <= end ){
            mid = start + ( end - start )/2 ;

            if(mid % 2 == 1 ) mid-- ;
            if(nums[mid] == nums[mid+1] ){
                start = mid +2 ;
            }
            else{
                end  = mid ;
            }
        }
        return nums[mid] ;
    }
}
