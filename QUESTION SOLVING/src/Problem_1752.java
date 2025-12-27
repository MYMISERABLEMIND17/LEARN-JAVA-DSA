public class Problem_1752 {
    public static void main(String[] args) {
        int [] a = { 1,2,3,4 ,5} ;
        int[] b  = {3,4,5,1,2} ;
        int x = 3  ;

        for (int i = 0; i < a.length ; i++) {
            if(b[i] == a[(i+x % a.length-1)]){
                System.out.println(b[i]);
            }
        }


//        System.out.println(logic(arr));
    }

//    static boolean logic (int[] nums ){
//        int count = 0 ;
//        for (int i = 0; i<nums.length-1 ; i++) {
//            int j = i+1 ;
//            if(nums[i] > nums[j] || nums[0] > nums[nums.length-1 ]){
//                count++ ;
//                if(count >=1 ){
//                    if(nums[0] < nums[nums.length-1]){
//                        count ++ ;
//                    }
//                }
//            }
//        }
//        if (count <=1) {
//            return true ;
//        }
//        return false ;
//    }
}
