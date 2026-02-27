public class Problem_1491 {
    public static void main(String[] args) {
        int[] arr = {1000,2000,3000} ;
        logic(arr);
    }
    static double logic(int[] nums ){
        int max = nums[0] ;
        int  min = nums[0] ;
        double sum = 0 ;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] > max){
                max= nums[i] ;
            }
            if(nums[i] < min){
                min = nums[i] ;
            }
            sum = sum+nums[i] ;
        }
        sum = sum - (max+ min);
        double count = (nums.length-2) ;
        double ans = sum/count;
        return ans ;

    }
}
