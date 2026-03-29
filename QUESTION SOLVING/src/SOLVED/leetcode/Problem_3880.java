//public class Problem_dontknow {
//    public static void main(String[] args) {
//        int[] arr = {1,0,0,2,0,1} ;
//        logic(arr);
//    }
//    static void logic(int[] nums){
//        int min =Integer.MAX_VALUE ;
//        for (int i = 0; i < nums.length ; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                int diff = i-j ;
//                if(diff < 0){
//                    diff = diff * -1 ;
//                }
//
//                if(nums[i] == 1 && nums[j] == 2 && diff < min){
//                    min = diff ;
//                }
//            }
//        }
//        if(min != Integer.MAX_VALUE){
//            return min ;
//        }
//        return -1 ;
//    }
//}
