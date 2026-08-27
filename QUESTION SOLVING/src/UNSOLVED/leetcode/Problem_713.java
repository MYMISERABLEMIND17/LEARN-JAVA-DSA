public class Problem_713 {
    static void main() {
        int[] nums = {10,5,2,6} ;
        int k = 100 ;

        int prod = 1 ;
        int start  = 0 ;
        int end = 0 ;
        int count  = 0 ;

        while(end < nums.length ){
            prod = prod * nums[end] ;
            while (prod >= k){
                prod = prod / nums[start] ;
                start++ ;
            }
            count = count + end-start+1 ;
            end++ ;
        }


        System.out.println(count);
    }
}
