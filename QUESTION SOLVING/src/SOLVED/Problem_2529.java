package SOLVED;

public class Problem_2529 {
    public static void main(String[] args) {
        int[] arr = {5,20,66,1314} ;
        logic(arr) ;
        System.out.println(logic(arr));
    }
    static int logic(int[] nums){
        int neg = 0 ;
        int pos = 0 ;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] < 0  ){
                neg++ ;
            } else if (nums[i] >0) {
                pos++ ;
            }
        }
        return Math.max(pos , neg) ;
    }
}
