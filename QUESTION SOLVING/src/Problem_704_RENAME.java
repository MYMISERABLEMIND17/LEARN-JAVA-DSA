public class Problem_704_RENAME {
    public static void main(String[] args) {
        int[] myarr = {-1,0,3,5,9,12} ;
        int target = 5 ;
        binary( myarr  , target );
    }
    static void binary(int[] nums , int target){
        //bubble sort the arrays
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 1; j < nums.length ; j++) {
                if(nums[j-1] > nums[j] && nums[j-1] != nums[j]){
                    // swap
                    int temp  = nums[j-1] ;
                    nums[j-1] = nums[j] ;
                    nums[j]  = temp ;
                }

            }
        }
        int min = 0 ;
        int max = nums.length -1 ;
        while(min<max){
            int mid = min + (max-min)/2;
            if(nums[mid]>target){
                min = mid+1 ;
            } else if (nums[mid]<target) {
                max = mid -1 ;
            } else if (target == mid ) {
                System.out.println(mid);
            }
        }

    }
}
