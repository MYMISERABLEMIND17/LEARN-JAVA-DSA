package UNSOLVED.leetcode;

public class Problem_605 {
    public static void main(String[] args) {
        int[] fb = {0,0,1,0,0} ;
        int n = 1 ;

        System.out.println(logic(fb , n ));
    }
    static boolean logic(int[] nums , int n ){
        int count = 0 ;
        for (int i = 0; i < nums.length ; i++) {

            if(nums.length == 1 ){
                if(nums[i] == 0 ){
                    count++;
                }
                break ;
            }

            if(i == 0  ){
                if(nums[i+1] == 0 &&  nums[i] == 0){
                    nums[i] = 1 ;
                    count++ ;
                }
            }
            else if ( i == nums.length-1  && nums[i] == 0 ) {
                if(nums[i-1] == 0  ){
                    nums[i] = 1 ;
                    count++ ;
                }
            }
            else {
                if( i > 0 && i < nums.length-1 && nums[i-1] == 0  && nums[i+1] == 0 && nums[i] != 1 ){
                    nums[i] = 1 ;
                    count++ ;
                }
            }

        }
        System.out.println(count);
        if(n == count){
            return true ;
        }

        return false ;
    }
}
