public class Problem_845 {
    static void main(String[] args) {
        int[] nums = {2,1,4,7,3,2,5} ;

        // iterate to every index   ;
        int maxlen = 0 ;

//        for (int i = 0; i < nums.length ; i++) {
//            int len = 1 ;
//            int j = i ;
//            int cleft = j ;
//            int cright = j ;
//            while (cleft >=1   && cright < nums.length-1) {
//                if (nums[cleft-1] < nums[cleft] && nums[cright+1] < nums[cright]){
//                    len +=2 ;
//                    maxlen = Math.max(maxlen , len) ;
//                    cleft--  ;
//                    cright++ ;
//                }
//                else{
//                    break;
//                }
//
//            }
//        }
//        System.out.println(maxlen);
        int decrement  = 0 ;
        int increment   = 0 ;
        int start = 0 ;
        int count  = 0 ;
        int i = 1 ;
        while (i < nums.length ){
            if(nums[i-1] < nums[i] ){
                count++ ;
                increment++ ;
            } else if (nums[i] > nums[i+1]){
                count-- ;
                decrement++ ;
            }

            i++ ;
        }
    }
}
