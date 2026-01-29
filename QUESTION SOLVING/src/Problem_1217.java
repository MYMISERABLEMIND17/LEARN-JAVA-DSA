public class Problem_1217 {
    public static void main(String[] args) {
        int[] arr  = {1,2,2} ;
        logic(arr) ;
    }
    static void logic(int[] nums){
//        int greatest = nums[0] ;
        int maxCount = 0 ;
        int count = 0 ;
        for (int i = 0; i < nums.length-1 ; i++) {
            if(nums[i] == nums[i+1] ){
                count++ ;
                if(count > maxCount){
//                    greatest = nums[i];
                    maxCount = count ;
                }

            }
            else if (nums[i] != nums[i+1]) {
                count = 0 ;
            }
        }
        int cost = 0 ;

        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] - maxCount == 2 || nums[i] - maxCount == -2 ){
                cost = cost + 0 ;
            }
            else if(nums[i] - maxCount == 1 || nums[i] - maxCount == -1 ){
                cost = cost + 1 ;
            }

        }
        System.out.println(cost);

    }
}
