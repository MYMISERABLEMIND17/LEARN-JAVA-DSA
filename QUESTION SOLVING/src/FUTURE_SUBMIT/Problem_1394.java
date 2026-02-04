package FUTURE_SUBMIT;

public class Problem_1394 {

    public static void main(String[] args) {
        int[] arr = {2,2,2,3,3};
        System.out.println(logic(arr));
    }
    static int logic( int[] nums ){
        int lucknum = -1 ;

        for (int i = 0; i < nums.length; i++) {
            int count = 0 ;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] == nums[i]){
                    count++ ;
                }
            }
            if(count == nums[i]  && nums[i] > lucknum){
                lucknum = nums[i] ;
            }
        }
        return lucknum ;
    }

}
