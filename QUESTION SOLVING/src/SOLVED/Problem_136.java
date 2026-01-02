package SOLVED;

public class Problem_136 {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2} ;

        System.out.println(logic(arr));
    }
    static int logic(int[] nums){
       int a = 0 ;
        for(int i = 0 ; i < nums.length ; i++ ){
            a = nums[i] ^ a ;
        }
        return a ;
    }
}
