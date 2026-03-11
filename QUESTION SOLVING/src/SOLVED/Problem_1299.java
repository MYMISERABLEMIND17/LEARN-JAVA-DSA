package SOLVED;

public class Problem_1299 {
    public static void main(String[] args) {
        int[] arr = {400} ;
        logic(arr);
    }
    static int[] logic(int[] nums){
        int[] x = new int[nums.length] ;
        int max = nums[0] ;

        for (int i = 0; i < nums.length ; i++) {
//            last edge case


            if(nums[i] == max) {
                max = 0 ;
                int j = i+1  ;
                while(j < nums.length){
                    if(nums[j] > max) {
                        max = nums[j];
                    }
                    j++ ;
                }
            }
            x[i] = max ;
            if(i == nums.length-1 ){
                x[i] = -1 ;
            }

        }
        return x ;


    }
}
