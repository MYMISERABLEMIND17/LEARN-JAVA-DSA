public class Problem_1685 {
    public static void main(String[] args) {

        int[] nums = {1,1,4,2,3} ;
        int x = 5 ;
        // create left windoe
        int lcount = 0 ;
        int ltar   = x  ;
        for (int i = 0; i < nums.length; i++) {
            ltar  = ltar - nums[i] ;
            if ( ltar  < 0 ) {
                break ;
            }
            else{
                lcount++ ;
            }
        }
        System.out.println(lcount);

        int rcount = 0 ;
        int rtar   = x  ;
        for (int i = nums.length-1 ; i >=0 ; i -- ) {
            rtar  = rtar - nums[i] ;
            if ( rtar  < 0 ) {
                break ;
            }
            else{
                rcount++ ;
            }
        }
        System.out.println(rcount);

        int btar = x ;
        int start = 0 ;
        int end = nums.length-1 ;
        while (start < end){

        }

    }
}
